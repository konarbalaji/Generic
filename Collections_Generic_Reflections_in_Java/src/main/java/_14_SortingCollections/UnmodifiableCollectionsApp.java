package _14_SortingCollections;

import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class UnmodifiableCollectionsApp {

    public static void main(String[] args) throws IOException, AttachNotSupportedException {

        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        // attach to target VM
        VirtualMachine vm = VirtualMachine.attach("26068");
        List<VirtualMachineDescriptor> s = VirtualMachine.list();
        for(VirtualMachineDescriptor v : s)
            System.out.println(v);

        // start management agent
       /* Properties props = new Properties();
        props.put("com.sun.management.jmxremote.port", "5000");
        vm.startManagementAgent(props);*/


        System.out.println("Nums adress is : " );
        nums = Collections.unmodifiableList(nums);
        //modify(nums);

        System.out.println(nums);

    }

    public static void modify(List<Integer> list){
        list.remove(0);
    }
}