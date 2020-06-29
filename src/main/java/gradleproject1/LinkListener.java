/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.AbstractAction;

/**
 *
 * @author truongduythai
 */
public class LinkListener extends AbstractAction {
    
    private String textLink;

    LinkListener(String textLink) {
        this.textLink = textLink;
    }

    protected void execute() {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URL(textLink).toURI());
        } catch (IOException | URISyntaxException ex) {
        }
    }
        

    @Override
    public void actionPerformed(ActionEvent e) {
        execute();
    }
    
}
