package com.codeclan.example.filesFolders.components;

import com.codeclan.example.filesFolders.models.File;
import com.codeclan.example.filesFolders.models.Folder;
import com.codeclan.example.filesFolders.models.User;
import com.codeclan.example.filesFolders.repositories.FileRepository;
import com.codeclan.example.filesFolders.repositories.FolderRepository;
import com.codeclan.example.filesFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("Del");
        userRepository.save(user1);
        Folder folder1 = new Folder("Photos",user1);
        folderRepository.save(folder1);
        File file1 = new File("image","jpg",folder1);
        fileRepository.save(file1);
    }
}
