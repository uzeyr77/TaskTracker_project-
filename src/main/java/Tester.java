import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.util.ArrayList;
public class Tester

{
    public static void main(String [] args) throws IOException {
        Person p1 = new Person(20, "uzeyr");
        Person p2 = new Person(25, "cla");
        Person p3 = new Person(29, "morgan");
        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        ArrayList<ObjectNode> nodeList = new ArrayList<>();
        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        String json = om.writeValueAsString(p1); // sterilize to json object

        Person copy = om.readValue(json, Person.class); // desterilize back into a Person object


        write(people);
    }

    public static void writeV2() {
        ObjectMapper om = new ObjectMapper();

    }

    public static void delete(Person person, ArrayList<Person> list) {
    // logic to delete a Person from the json file:
        // Loop through the arraylist of Person objs and find the target person to delete
        // once found, remove from the arraylist
        // then write the file again, this time it does not contain the deleted person object


        // DELETE THE PERSON OBJECT FROM THE LIST FIRST
        for(int i = 0; i < list.size();i++) {
            if(list.get(i).equals(person)) list.remove(i);
        }
        // REWRITE THE TO THE JSON FILE
        //write(list);


    }

    public static void update(Person person, String field, String update, ArrayList<Person> list) {
        // LOGIC ON UPDATING A PERSONS INFORMATION
        // take paramters including the person obj we want to update, the field we want to update
        // e.i name or age and the list
        // Loop through the list and find the person to update, once the target is found
        // use the setters to update the specified fields
        // then afterwards write to the file once more with the updates

        for(int i = 0; i < list.size();i++) {
            if(list.get(i).equals(person) && field.equals("Age")) {
                int newAge = Integer.parseInt(update);
                list.get(i).setAge(newAge);
            } else if(list.get(i).equals(person) && field.equals("Name")){
                list.get(i).setName(update);
            }

        }
        //write(list);
    }


    public static void write(ArrayList<Person> people) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());
        ObjectNode node;
        ArrayList<ObjectNode> list = new ArrayList<>();
        //ArrayList<String> strListOfJsonObj = new ArrayList<>();
        for(int i = 0; i < people.size();i++) {
            String json = om.writeValueAsString(people.get(i)); // could throw an exception
            Person copy = om.readValue(json, Person.class);
            node = om.createObjectNode();
            node.put("Name", copy.getName());
            node.put("Age", copy.getAge());
            node.put("Created at", copy.getDate());
            list.add(node);
        }

        try {
            // file object creation
            File file = new File("data/info.json");

            // write to json file

            om.writeValue(file, list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }


    // need to create new node for each json object
        // to add a single person object to the json file I need to:
        // 1 create the Person Object
        // 2 create a ObjectMapper object
        // 3 create an ObjectNode object
        // 4 use getters and setters from the person class to populate the ObjectNode with info

        // Issue when scaling to more Person Objects:
        // since there are a few Person objects I need more than 1 ObjectNode for each Person


        // Pseudocode to use for more than 1 Person Object:

        // Have an arrayList of Person objects
        // Create an initialize the ObjectMapper object
        // Create an ObjectNode object but do not initialize
        // have a loop that goes through the entire Person objects list
        // in the loop initalize a new ObjectNode and fill in the data from the Person Object
        // FAIL: does not add to the json file but simply writes a single object throughout the list overwriting it
        // SOLUTION: have a list of ObjectNode objects in a lists as well as Person objects list
        // loop through the person list and each time create a new Node with the details from the
        // current Person obj then add that node to an arraylist
        // then we write to the file OUTSIDE THE LOOP

//        write(people);
//        delete(p2, people);
//        update(p1,"Age", "99", people);
//        try {
//            // file object creation
//            File file = new File("data/info.json");
//
//            // write to json file
//
//            om.writeValue(file, node);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        String jsonObj = om.writeValueAsString(p1);
//        System.out.println(jsonObj);
  //      }