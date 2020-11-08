package progcomposant.tp.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progcomposant.tp.tp1.dto.ClientDTO;
import progcomposant.tp.tp1.model.Client;
import progcomposant.tp.tp1.repository.ClientRepository;
import progcomposant.tp.tp1.repository.VoitureRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private VoitureService voitureService;
    @Autowired
    private VoitureRepository voitureRepository;

    public Set<ClientDTO> findAll(){
        return listClientToDTO(clientRepository.findAll());
    }

    public void createClient(ClientDTO clientDTO){
        clientRepository.save(dtoToClient(clientDTO));
    }

    protected ClientDTO clientToDTO(Client client){
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(client.getId());
        clientDTO.setMail(client.getMail());
        clientDTO.setNom(client.getNom());
        clientDTO.setPrenom(client.getPrenom());
        clientDTO.setVoituresDTO(voitureService.lstVoitureToDTO(voitureRepository.findVoituresByClients(client)));
        return clientDTO;
    }

    protected Set<ClientDTO> listClientToDTO(Set<Client> listCLient){
        Set<ClientDTO> listDTO = new HashSet<>();
        for(Client client : listCLient){
            listDTO.add(clientToDTO(client));
        }
        return listDTO;
    }

    protected Client dtoToClient(@org.jetbrains.annotations.NotNull ClientDTO clientDTO){
        Client client = new Client();
        client.setId(clientDTO.getId());
        client.setMail(clientDTO.getMail());
        client.setNom(clientDTO.getNom());
        client.setPrenom(clientDTO.getPrenom());
        return client;
    }
    protected Set<Client> listDtoToClient(Set<ClientDTO> listClientDto){
        Set<Client> listClt = new HashSet<>();
        for(ClientDTO cltDto: listClientDto){
            listClt.add(dtoToClient(cltDto));
        }
        return listClt;
    }
}
