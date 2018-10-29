package com.masha.myFirstTestProject.enumExample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class EnumApp {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setAge(18);
        user.setName("Masha");
        user.setLastName("Mezentseva");

        Status status = readFromDB();
        user.setStatus(status);

        String stringStatus = "ACTIVE";
        status = Enum.valueOf(Status.class, stringStatus);
        status = Status.valueOf(stringStatus);
        System.out.println(status.name());
        System.out.println(status.ordinal());
        Arrays.stream(Status.values())
                .forEach(System.out::println);

        System.out.println(status.getWrapped());

        String userInfo = user.toString();
        System.out.println(userInfo);
        System.out.println("-----------------------------------------------------");

        Descriptor descriptor = Descriptor.DB_CONNECTION_MODE;

        boolean b = isPresent(descriptor, new File("c:/pf/rrr.txt"));

    }

    private static boolean isPresent(Descriptor descriptor, File file) throws IOException {
        //String s = new String(Files.readAllBytes(file.toPath()));
        String s = "dfgdfgsdfb ${lastName} sdfbsdfvbsdfbsdfbsdfe";
        return s.contains(descriptor.getDescriptorString());
    }

    private static Status readFromDB(){
        return Status.FIRED;
    }
}
