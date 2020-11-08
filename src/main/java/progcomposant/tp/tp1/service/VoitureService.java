package progcomposant.tp.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progcomposant.tp.tp1.dto.VoitureDTO;
import progcomposant.tp.tp1.model.Client;
import progcomposant.tp.tp1.model.Voiture;
import progcomposant.tp.tp1.repository.VoitureRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;
    @Autowired
    private MarqueService marqueService;

    public Set<VoitureDTO> findVoituresByClient(Client client){
        return lstVoitureToDTO(voitureRepository.findVoituresByClients(client));
    }

    public Set<VoitureDTO> findAll(){
        return lstVoitureToDTO((voitureRepository.findAll()));
    }

    public Set<VoitureDTO> findByMarqueId(int marqueId){
        return lstVoitureToDTO(voitureRepository.findByMarqueId(marqueId));
    }

    public void createVoiture(VoitureDTO voitureDTO){
        voitureRepository.save(dtoToVoiture(voitureDTO));
    }

    protected VoitureDTO voitureToDTO(Voiture voiture){
        VoitureDTO voitureDTO = new VoitureDTO();
        voitureDTO.setCouleur(voiture.getCouleur());
        voitureDTO.setId(voiture.getId());
        voitureDTO.setModele(voiture.getModele());
        voitureDTO.setOption(voiture.getOption());
        voitureDTO.setMarqueDTO(marqueService.marqueToDTO(voiture.getMarque()));
        return voitureDTO;
    }
    protected Voiture dtoToVoiture(VoitureDTO voitureDTO){
        Voiture voiture=new Voiture();
        voiture.setCouleur(voitureDTO.getCouleur());
        voiture.setId(voitureDTO.getId());
        voiture.setOption(voitureDTO.getOption());
        voiture.setModele(voitureDTO.getModele());
        voiture.setMarque(marqueService.dtoToMarque(voitureDTO.getMarqueDTO()));
        return voiture;
    }
    protected Set<Voiture> lstDtoToVoiture(Set<VoitureDTO> lstDTO){
        Set<Voiture> lstVoiture=new HashSet<>();
        for(VoitureDTO dto:lstDTO){
            lstVoiture.add(dtoToVoiture(dto));
        }
        return lstVoiture;
    }

    protected Set<VoitureDTO> lstVoitureToDTO(Set<Voiture> lstVoiture){
        Set<VoitureDTO> lstDTO= new HashSet<>();
        for(Voiture voiture: lstVoiture){
            lstDTO.add(voitureToDTO(voiture));
        }
        return lstDTO;
    }

}
