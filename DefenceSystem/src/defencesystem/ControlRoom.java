/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrator
 */
public class ControlRoom {

    private List<Observer> defenceObjArrayList=new ArrayList<>();
    private static List<String> msgArrayList=new ArrayList<>();
    private static List<String> privatemsgArrayList=new ArrayList<>();
    private MainControllerWindow mainControllerWindowRef;
    

//--------------Add Observer To Array List--------------------------------------
    public void addObserverToArrayList(Observer observer){
        observer. controllRoomRefSet(this);
        defenceObjArrayList.add(observer); 
        
        
    }
//------------------Call all Observer for AreaClear in Observer Array list -----
    public void callAreaClear(String text){
        for(int i=0;i<defenceObjArrayList.size();i++){
            defenceObjArrayList.get(i).areaClear(text);
        }
    }
//---------------Call all Observer for Enable button in Observer Array list-----
    public void callsliderChangers(int value){
        for(int i=0;i<defenceObjArrayList.size();i++){
            defenceObjArrayList.get(i).sliderChangers(value);
        }
    }
//---------------Settrs for msgArrayList----------------------------------------
    public void setMsgToArrayList(String text){
        clearAllTextArea();
        msgArrayList.add(text);
        refeshTextArea();
    }
//---------------Settrs for PrivatemsgArrayList----------------------------------------
    public void setMsgTopraivateArrayList(String text){
        //clearAllTextArea();
        privatemsgArrayList.add(text);
        //refeshTextArea();
    }
//---------------After Add Msg Refesh TextArea----------------------------------
    private void refeshTextArea(){
        for(int i=0;i<msgArrayList.size();i++){
            mainControllerWindowRef.setMsgtojTextAreaShowMsg(msgArrayList.get(i));
            for(int j=0;j<defenceObjArrayList.size();j++){
                defenceObjArrayList.get(j).setMsgtojTextAreaShowMsg(msgArrayList.get(i));
            }
        }
    }
//---------------Main controller Reffrence set to controller--------------------
    public void mainControllerRefSet(MainControllerWindow mainControllerWindowRef){
        this.mainControllerWindowRef=mainControllerWindowRef;
    }
//------------------------Clear after Click send button all Text Area-----------
    public void clearAllTextArea(){
        mainControllerWindowRef.clearTextArea();
        for(int j=0;j<defenceObjArrayList.size();j++){
            defenceObjArrayList.get(j).clearTextArea();
        }
    };
//-----------------------enable All Msg Send Area-------------------------------
    public void enableAllMsgSendTextArea(boolean conditon){
        for(int i=0;i<defenceObjArrayList.size();i++){
            defenceObjArrayList.get(i).enableAllMsgSendTextArea(conditon);
        }
    }
//-----------------------enable Custom Msg Send Area-------------------
     public void enableCustomMsgSendTextArea(boolean conditon,int index){
        defenceObjArrayList.get(index).enableAllMsgSendTextArea(conditon);
    }
}
