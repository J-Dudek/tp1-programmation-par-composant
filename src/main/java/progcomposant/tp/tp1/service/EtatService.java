package progcomposant.tp.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progcomposant.tp.tp1.repository.*;

@Service
public class EtatService {

    @Autowired
    private AdresseRepository adresseRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ConcessionnaireRepository concessionnaireRepository;
    @Autowired
    private MarqueRepository marqueRepository;
    @Autowired
    private VoitureRepository voitureRepository;

    private static final String LINE = "line.separator";

    public StringBuilder getAllInfosBDD(){
        StringBuilder rs = new StringBuilder();
        rs.append("Nb d'adresses : "+adresseRepository.count());
        rs.append(System.getProperty(LINE));
        rs.append("Nb de Client : "+clientRepository.count());
        rs.append(System.getProperty(LINE));
        rs.append("Nb de Concessionnaire : "+concessionnaireRepository.count());
        rs.append(System.getProperty(LINE));
        rs.append("Nb de Marque : "+marqueRepository.count());
        rs.append(System.getProperty(LINE));
        rs.append("Nb de Voiture : "+voitureRepository.count());
        rs.append(System.getProperty(LINE));
        rs.append("Fin de la liste");

        return rs;
    }
}
