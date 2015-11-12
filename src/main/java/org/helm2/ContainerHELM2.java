/*--
 *
 * @(#) ContainerHELM2.java
 *
 *
 */
package org.helm2;

import java.util.ArrayList;

import org.helm.notation2.parser.Notation.HELM2Notation;
import org.helm.notation2.parser.Notation.Polymer.MonomerNotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@code ContainerHELM2}
 * TODO comment me
 * 
 * @author 
 * @version $Id$
 */
public class ContainerHELM2 {

  /** The Logger for this class */
  private static final Logger LOG =
      LoggerFactory.getLogger(ContainerHELM2.class);

  HELM2Notation helm2notation;

  InterConnections interconnection;

  public ContainerHELM2(HELM2Notation helm2notation,
      InterConnections interconnection) {
    this.helm2notation = helm2notation;
    this.interconnection = interconnection;
  }

  public HELM2Notation getHELM2Notation() {
    return helm2notation;
  }

  public InterConnections getInterconnection() {
    return interconnection;
  }

  public ArrayList<MonomerNotation> getListOfMonomers() {
    ArrayList<MonomerNotation> items = new ArrayList<MonomerNotation>();
    for (int i = 0; i < helm2notation.getListOfPolymers().size(); i++) {
      items.addAll(helm2notation.getListOfPolymers().get(i).getListMonomers());
    }

    return items;

  }
}
