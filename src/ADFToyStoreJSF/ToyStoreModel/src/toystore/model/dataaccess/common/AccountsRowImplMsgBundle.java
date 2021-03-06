/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/dataaccess/common/AccountsRowImplMsgBundle.java,v 1.1.1.1 2006/01/26 21:47:22 steve Exp $
package toystore.model.dataaccess.common;
import oracle.jbo.common.JboResourceBundle;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
public class AccountsRowImplMsgBundle extends JboResourceBundle {

  /**
   * This is the default constructor (do not remove)
   */
  public AccountsRowImplMsgBundle() {
  }

  /**
   * @return an array of key-value pairs.
   */
  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }

  static final Object[][] sMessageStrings = {
    {"Status_DISPLAYHINT", "Hide"},
    {"Userid_DISPLAYHINT", "Hide"}};
}
