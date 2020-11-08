package progcomposant.tp.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progcomposant.tp.tp1.dto.MarqueDTO;
import progcomposant.tp.tp1.model.Marque;
import progcomposant.tp.tp1.repository.MarqueRepository;
import progcomposant.tp.tp1.repository.VoitureRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class MarqueService {

    @Autowired
    private MarqueRepository marqueRepository;
    @Autowired
    private VoitureService voitureService;
    @Autowired
    private VoitureRepository voitureRepository;

    public Set<MarqueDTO> findAll(){
        return listMarqueToDTO(marqueRepository.findAll());
    }

    public MarqueDTO findByNom(String nom){
        return marqueToDTO(marqueRepository.findByNomIgnoreCase(nom));
    }

    public void createMarque(MarqueDTO marqueDTO){
        marqueRepository.save(dtoToMarque(marqueDTO));
    }
    public void deleteById(int id){
        voitureService.deleteByMarqueId(id);
        marqueRepository.deleteById(id);
    }
    protected MarqueDTO marqueToDTO(Marque marque){
        MarqueDTO marqueDTO = new MarqueDTO();
        marqueDTO.setId(marque.getId());
        marqueDTO.setNom(marque.getNom());
        return marqueDTO;
    }

    protected Set<MarqueDTO> listMarqueToDTO(Set<Marque> listMarque){
        Set<MarqueDTO> setDTO = new HashSet<>();
        for(Marque marque: listMarque){
            setDTO.add(marqueToDTO(marque));
        }
        return setDTO;
    }

    protected Marque dtoToMarque(MarqueDTO marqueDto){
        Marque marque = new Marque();
        marque.setId(marqueDto.getId());
        marque.setNom(marqueDto.getNom());
        return marque;
    }

    protected Set<Marque> lisDtoToMarque(Set<MarqueDTO> lstDto){
        Set<Marque> lstMarque = new HashSet<>();
        for(MarqueDTO marqDTO : lstDto){
            lstMarque.add(dtoToMarque(marqDTO));
        }
        return lstMarque;
    }

}
