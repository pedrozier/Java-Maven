/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import Util.ApplicationClient;
import java.awt.Color;
import model.MyUser;

/**
 *
 * @author zier
 */
public class AppForm extends javax.swing.JFrame {

    ApplicationClient client = new ApplicationClient();

    /**
     * Creates new form AppForm
     */
    public AppForm() {
        initComponents();
        setEnable(false);

    }

    public void setEnable(boolean enable) {
        idField.setEnabled(enable);
        nameField.setEnabled(enable);
        passwordField.setEnabled(enable);
        saveBtn.setEnabled(enable);
        updateBtn.setEnabled(enable);
        findbyidBtn.setEnabled(enable);
        findallBtn.setEnabled(enable);
        deleteBtn.setEnabled(enable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userManagerPane = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        lblUserManager = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        findallBtn = new javax.swing.JButton();
        findbyidBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblResult = new javax.swing.JLabel();
        resultPane = new javax.swing.JScrollPane();
        textResult = new javax.swing.JTextPane();
        loginPane = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblPasswordLogin = new javax.swing.JLabel();
        lblNameLogin = new javax.swing.JLabel();
        nameFieldLogin = new javax.swing.JTextField();
        passwordFieldLogin = new javax.swing.JPasswordField();
        lblStatusLogin = new javax.swing.JLabel();
        lblStatusLogin1 = new javax.swing.JLabel();
        lblStatusLogin2 = new javax.swing.JLabel();
        lblStatusApi = new javax.swing.JLabel();
        buttonTesteApi = new javax.swing.JButton();
        buttonExecuteLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        userManagerPane.setEnabled(false);

        lblID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(51, 51, 51));
        lblID.setText("id:");

        lblName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 51));
        lblName.setText("name:");

        lblPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 51, 51));
        lblPassword.setText("password:");

        passwordField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        idField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        nameField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        lblUserManager.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserManager.setText("User Manager:");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        findallBtn.setText("FindAll");
        findallBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findallBtnActionPerformed(evt);
            }
        });

        findbyidBtn.setText("FindByID");
        findbyidBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findbyidBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userManagerPaneLayout = new javax.swing.GroupLayout(userManagerPane);
        userManagerPane.setLayout(userManagerPaneLayout);
        userManagerPaneLayout.setHorizontalGroup(
            userManagerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userManagerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserManager)
                    .addGroup(userManagerPaneLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(userManagerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblName)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(userManagerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField)
                            .addComponent(nameField)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(userManagerPaneLayout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findbyidBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findallBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userManagerPaneLayout.setVerticalGroup(
            userManagerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userManagerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(userManagerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(userManagerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(userManagerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn)
                    .addComponent(findbyidBtn)
                    .addComponent(findallBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblResult.setText("Result:");

        textResult.setEditable(false);
        resultPane.setViewportView(textResult);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblResult)
                        .addGap(0, 570, Short.MAX_VALUE))
                    .addComponent(resultPane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultPane, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogin.setText("Login:");

        lblPasswordLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPasswordLogin.setForeground(new java.awt.Color(51, 51, 51));
        lblPasswordLogin.setText("password:");

        lblNameLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNameLogin.setForeground(new java.awt.Color(51, 51, 51));
        lblNameLogin.setText("name:");

        nameFieldLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nameFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldLoginActionPerformed(evt);
            }
        });

        passwordFieldLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        passwordFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldLoginActionPerformed(evt);
            }
        });

        lblStatusLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStatusLogin.setForeground(new java.awt.Color(255, 0, 0));
        lblStatusLogin.setText("disconnected");

        lblStatusLogin1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStatusLogin1.setForeground(new java.awt.Color(51, 51, 51));
        lblStatusLogin1.setText("User Status:");

        lblStatusLogin2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStatusLogin2.setForeground(new java.awt.Color(51, 51, 51));
        lblStatusLogin2.setText("Api Status:");

        lblStatusApi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStatusApi.setForeground(new java.awt.Color(255, 0, 0));
        lblStatusApi.setText("disconnected");

        buttonTesteApi.setText("Test API");
        buttonTesteApi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTesteApiActionPerformed(evt);
            }
        });

        buttonExecuteLogin.setText("Log In");
        buttonExecuteLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExecuteLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPaneLayout = new javax.swing.GroupLayout(loginPane);
        loginPane.setLayout(loginPaneLayout);
        loginPaneLayout.setHorizontalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPaneLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(loginPaneLayout.createSequentialGroup()
                                        .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNameLogin)
                                            .addComponent(lblPasswordLogin))
                                        .addGap(18, 18, 18)
                                        .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(passwordFieldLogin)
                                            .addComponent(nameFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblStatusLogin2)))
                            .addComponent(lblLogin))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPaneLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblStatusLogin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatusApi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatusLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonExecuteLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonTesteApi, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
                .addContainerGap())
        );
        loginPaneLayout.setVerticalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameLogin))
                .addGap(18, 18, 18)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordLogin))
                .addGap(18, 18, 18)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusLogin2)
                    .addComponent(lblStatusApi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTesteApi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusLogin)
                    .addComponent(lblStatusLogin1)
                    .addComponent(buttonExecuteLogin))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userManagerPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userManagerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void nameFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldLoginActionPerformed

    }//GEN-LAST:event_nameFieldLoginActionPerformed

    private void passwordFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldLoginActionPerformed

    }//GEN-LAST:event_passwordFieldLoginActionPerformed

    private void buttonTesteApiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTesteApiActionPerformed
        try {
            client.testApi();
            lblStatusApi.setForeground(Color.blue);
            lblStatusApi.setText("SUCCESS");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");

        } catch (Exception ex) {
            lblStatusApi.setForeground(Color.red);
            lblStatusApi.setText("ERROR");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
        }
    }//GEN-LAST:event_buttonTesteApiActionPerformed

    private void buttonExecuteLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExecuteLoginActionPerformed
        try {
            client.doLogin(nameFieldLogin.getText(), passwordFieldLogin.getText());
            if (client.getStatus() == 200) {
                lblStatusApi.setForeground(Color.blue);
                lblStatusApi.setText("SUCCESS");
                lblStatusLogin.setForeground(Color.blue);
                lblStatusLogin.setText("LOGGED IN");
                setEnable(true);
            } else {
                lblStatusApi.setForeground(Color.red);
                lblStatusApi.setText("ERROR");
                lblStatusLogin.setForeground(Color.red);
                lblStatusLogin.setText("DENIED");
                setEnable(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            lblStatusApi.setForeground(Color.red);
            lblStatusApi.setText("ERROR");
            lblStatusLogin.setForeground(Color.red);
            lblStatusLogin.setText("DENIED");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
        }
        textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
        nameFieldLogin.setText("");
        passwordFieldLogin.setText("");
    }//GEN-LAST:event_buttonExecuteLoginActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        try {
            client.update(new MyUser(Long.parseLong(idField.getText()), nameField.getText(), passwordField.getText()));
            lblStatusApi.setForeground(Color.blue);
            lblStatusApi.setText("SUCCESS");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
        } catch (Exception e) {
            e.printStackTrace();
            lblStatusApi.setForeground(Color.red);
            lblStatusApi.setText("ERROR");
            textResult.setText(Integer.toString(client.getStatus()) + "\n");
            if (client.getStatus() == 500) {
                lblStatusLogin.setForeground(Color.red);
                lblStatusLogin.setText(client.getResult());
                setEnable(false);
            }
        }
        if (client.getStatus() == 500) {
            lblStatusLogin.setForeground(Color.red);
            lblStatusLogin.setText(client.getResult());
            setEnable(false);
        }
        textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n" + client.getResult() + "\n");
        nameField.setText("");
        passwordField.setText("");
        idField.setText("");
    }//GEN-LAST:event_updateBtnActionPerformed

    private void findbyidBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findbyidBtnActionPerformed
        try {
            client.findByID(Long.parseLong(idField.getText()));
            lblStatusApi.setForeground(Color.blue);
            lblStatusApi.setText("SUCCESS");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
        } catch (Exception e) {
            e.printStackTrace();
            lblStatusApi.setForeground(Color.red);
            lblStatusApi.setText("ERROR");
            textResult.setText(Integer.toString(client.getStatus()) + "\n");
            if (client.getStatus() == 500) {
                lblStatusLogin.setForeground(Color.red);
                lblStatusLogin.setText(client.getResult());
                setEnable(false);
            }
        }
        if (client.getStatus() == 500) {
            lblStatusLogin.setForeground(Color.red);
            lblStatusLogin.setText(client.getResult());
            setEnable(false);
        }
        textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n" + client.getResult() + "\n");
        nameField.setText("");
        passwordField.setText("");
        idField.setText("");
    }//GEN-LAST:event_findbyidBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            client.save(new MyUser(nameField.getText(), passwordField.getText()));
            lblStatusApi.setForeground(Color.blue);
            lblStatusApi.setText("SUCCESS");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
        } catch (Exception e) {
            e.printStackTrace();
            lblStatusApi.setForeground(Color.red);
            lblStatusApi.setText("ERROR");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
            if (client.getStatus() == 500) {
                lblStatusLogin.setForeground(Color.red);
                lblStatusLogin.setText(client.getResult());
                setEnable(false);
            }
        }
        if (client.getStatus() == 500) {
            lblStatusLogin.setForeground(Color.red);
            lblStatusLogin.setText(client.getResult());
            setEnable(false);
        }
        textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n" + client.getResult() + "\n");
        nameField.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_saveBtnActionPerformed

    private void findallBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findallBtnActionPerformed
        try {
            client.findAll();
            lblStatusApi.setForeground(Color.blue);
            lblStatusApi.setText("SUCCESS");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
        } catch (Exception e) {
            e.printStackTrace();
            lblStatusApi.setForeground(Color.red);
            lblStatusApi.setText("ERROR");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
            if (client.getStatus() == 500) {
                lblStatusLogin.setForeground(Color.red);
                lblStatusLogin.setText(client.getResult());
                setEnable(false);
            }
        }
        if (client.getStatus() == 500) {
            lblStatusLogin.setForeground(Color.red);
            lblStatusLogin.setText(client.getResult());
            setEnable(false);
        }
        textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n" + client.getResultList() + "\n");
        nameField.setText("");
        passwordField.setText("");
        idField.setText("");
    }//GEN-LAST:event_findallBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            client.delete(Long.parseLong(idField.getText()));
            lblStatusApi.setForeground(Color.blue);
            lblStatusApi.setText("SUCCESS");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
        } catch (Exception e) {
            e.printStackTrace();
            lblStatusApi.setForeground(Color.red);
            lblStatusApi.setText("ERROR");
            textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n");
            if (client.getStatus() == 500) {
                lblStatusLogin.setForeground(Color.red);
                lblStatusLogin.setText(client.getResult());
                setEnable(false);
            }
        }
        if (client.getStatus() == 500) {
            lblStatusLogin.setForeground(Color.red);
            lblStatusLogin.setText(client.getResult());
            setEnable(false);
        }
        textResult.setText("Status: " + Integer.toString(client.getStatus()) + "\n" + client.getResult() + "\n");
        nameField.setText("");
        passwordField.setText("");
        idField.setText("");
    }//GEN-LAST:event_deleteBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExecuteLogin;
    private javax.swing.JButton buttonTesteApi;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton findallBtn;
    private javax.swing.JButton findbyidBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordLogin;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblStatusApi;
    private javax.swing.JLabel lblStatusLogin;
    private javax.swing.JLabel lblStatusLogin1;
    private javax.swing.JLabel lblStatusLogin2;
    private javax.swing.JLabel lblUserManager;
    private javax.swing.JPanel loginPane;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameFieldLogin;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordFieldLogin;
    private javax.swing.JScrollPane resultPane;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextPane textResult;
    private javax.swing.JButton updateBtn;
    private javax.swing.JPanel userManagerPane;
    // End of variables declaration//GEN-END:variables
}
