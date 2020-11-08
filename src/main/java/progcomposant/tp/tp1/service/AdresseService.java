package progcomposant.tp.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progcomposant.tp.tp1.dto.AdresseDTO;
import progcomposant.tp.tp1.model.Adresse;
import progcomposant.tp.tp1.repository.AdresseRepository;
import progcomposant.tp.tp1.repository.ConcessionnaireRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class AdresseService {

    @Autowired
    private AdresseRepository adresseRepository;

    @Autowired
    private ConcessionnaireRepository concessionnaireRepository;

    public Set<AdresseDTO> findAll(){
        return listAdresseToDTO(adresseRepository.findAll());
    }

    public Set<AdresseDTO> findByConcessionnaireId(int concessionnaireId){
        Set<AdresseDTO> adresseDTO = new HashSet<>();
        for(Adresse add : adresseRepository.findByConcessionnaireId(concessionnaireId)){
            adresseDTO.add(adresseToDTO(add));
        }
        return adresseDTO;
    }

    public void saveOrUpdateAdresse(AdresseDTO adresseDTO){
        adresseRepository.save(dtoToAdresse(adresseDTO));
    }


    public void createAdresse(AdresseDTO adresseDTO){
        adresseRepository.save(dtoToAdresse(adresseDTO));
    }

    public void deleteAdresseById(int id){
        adresseRepository.deleteById(id);
    }
    public void onDeleteConcessionnaire( int idConcessionnaire){
        for(Adresse adresse : adresseRepository.findByConcessionnaireId(idConcessionnaire)){
            adresse.setConcessionnaire(null);
            adresseRepository.save(adresse);
        }
    }

    protected AdresseDTO adresseToDTO(Adresse adresse){
        AdresseDTO adresseDTO = new AdresseDTO();
        adresseDTO.setId(adresse.getId());
        adresseDTO.setNumero(adresse.getNumero());
        adresseDTO.setRue(adresse.getRue());
        adresseDTO.setComplement(adresse.getComplement());
        adresseDTO.setCodePostal(adresse.getCodepostal());
        adresseDTO.setVille(adresse.getVille());
        return adresseDTO;
    }

    protected Set<AdresseDTO> listAdresseToDTO(Set<Adresse> listAdress){
        Set<AdresseDTO> lstAdressDTO = new HashSet<>();
        for(Adresse add : listAdress){
            lstAdressDTO.add(adresseToDTO(add));
        }
        return  lstAdressDTO;
    }

    protected Adresse dtoToAdresse(AdresseDTO adresseDTO){
        Adresse adresse=new Adresse();
        adresse.setCodepostal(adresseDTO.getCodePostal());
        adresse.setComplement(adresseDTO.getComplement());
        adresse.setId(adresseDTO.getId());
        adresse.setNumero(adresseDTO.getNumero());
        adresse.setRue(adresseDTO.getRue());
        adresse.setVille(adresseDTO.getVille());
        return adresse;
    }

    protected Set<Adresse> lstAdressDtoToAdresse(Set<AdresseDTO> lstAdressDTO){
        Set<Adresse> lstAdress = new HashSet<>();
        for(AdresseDTO addDTO : lstAdressDTO){
            lstAdress.add(dtoToAdresse(addDTO));
        }
        return lstAdress;
    }

}
