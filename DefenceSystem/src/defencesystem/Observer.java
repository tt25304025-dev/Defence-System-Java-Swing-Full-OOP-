/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem;

/**
 *
 * @author Administrator
 */
public interface Observer {
  public void areaClear(String text);
  public void sliderChangers(int value);
  public void setMsgtojTextAreaShowMsg(String text);
  public void clearTextArea();
  public void controllRoomRefSet(ControlRoom DefenceObjRef);
  public void enableAllMsgSendTextArea(boolean conditon);
}
