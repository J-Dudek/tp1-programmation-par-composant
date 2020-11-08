package progcomposant.tp.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progcomposant.tp.tp1.dto.ConcessionnaireDTO;
import progcomposant.tp.tp1.model.Concessionnaire;
import progcomposant.tp.tp1.repository.AdresseRepository;
import progcomposant.tp.tp1.repository.ConcessionnaireRepository;
import progcomposant.tp.tp1.repository.MarqueRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class ConcessionnaireService {

    @Autowired
    private ConcessionnaireRepository concessionnaireRepository;
    @Autowired
    MarqueService marqueService;
    @Autowired
    MarqueRepository marqueRepository;
    @Autowired
    AdresseService adresseService;
    @Autowired
    AdresseRepository adresseRepository;


    public Set<ConcessionnaireDTO> findAll(){
        return lstConcessionnaireToDto(concessionnaireRepository.findAll());
    }

    public void createConcessionnaire(ConcessionnaireDTO concessionnaireDTO){
        concessionnaireRepository.save(dtoToConcessionnaire(concessionnaireDTO));
    }

    protected ConcessionnaireDTO concessionnaireToDTO(Concessionnaire concessionnaire){
        ConcessionnaireDTO concessionnaireDTO = new ConcessionnaireDTO();
        concessionnaireDTO.setId(concessionnaire.getId());
        concessionnaireDTO.setNom(concessionnaire.getNom());
        concessionnaireDTO.setMarquesDTO(marqueService.listMarqueToDTO(marqueRepository.findMarquesByConcessionnaires(concessionnaire)));
        concessionnaireDTO.setAdressesDTO(adresseService.listAdresseToDTO(adresseRepository.findByConcessionnaireId(concessionnaire.getId())));
        return concessionnaireDTO;
    }
    protected Concessionnaire dtoToConcessionnaire(ConcessionnaireDTO concessionnaireDTO){
        Concessionnaire concessionnaire = new Concessionnaire();
        concessionnaire.setId(concessionnaireDTO.getId());
        concessionnaire.setNom(concessionnaireDTO.getNom());
        return concessionnaire;
    }

    protected Set<Concessionnaire> lstDtoToConcessionnaire(Set<ConcessionnaireDTO> lstDto){
        Set<Concessionnaire> lstConcessionnaire = new HashSet<>();
        for(ConcessionnaireDTO conDTO : lstDto){
            lstConcessionnaire.add(dtoToConcessionnaire(conDTO));
        }
        return lstConcessionnaire;
    }

    protected Set<ConcessionnaireDTO> lstConcessionnaireToDto(Set<Concessionnaire> lstCon){
        Set<ConcessionnaireDTO> lstDTO = new HashSet<>();
        for(Concessionnaire con : lstCon){
            lstDTO.add(concessionnaireToDTO(con));
        }
        return lstDTO;
    }
}
