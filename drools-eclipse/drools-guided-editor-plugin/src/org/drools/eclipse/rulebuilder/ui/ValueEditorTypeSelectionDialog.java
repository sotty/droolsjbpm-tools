package org.drools.eclipse.rulebuilder.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class ValueEditorTypeSelectionDialog extends RuleDialog {

    private final FormToolkit toolkit;

    private RuleModeller      modeller;

   // private IConstraint       constraint;

    public ValueEditorTypeSelectionDialog(Shell parent,
                                          FormToolkit toolkit,
                                          RuleModeller modeller
                                          //,
                                          //IConstraint constraint
                                          ) {
        super(parent,"Select value editor type","Select value editor type" );
        this.toolkit = toolkit;
        this.modeller = modeller;
        //this.constraint = constraint;
    }

    protected Control createDialogArea(final Composite parent) {
        Composite composite = (Composite) super.createDialogArea( parent );

        toolkit.createLabel( composite,
                             "Field value:" );
        final Combo valueTypeCombo = new Combo( composite,
                                                SWT.READ_ONLY );
        valueTypeCombo.add( "Literal value" ); // 0
        valueTypeCombo.add( "A formula" ); // 1

        
        //TODO: adjust to new API
        
       /* if ( modeller.getModel().getBoundVariablesInScope( constraint ).size() > 0 ) {
            valueTypeCombo.add( "Bound variable" ); // 2
        }

        valueTypeCombo.addModifyListener( new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                switch ( valueTypeCombo.getSelectionIndex() ) {
                    case 0 :
                        constraint.constraintValueType = IFieldConstraint.TYPE_LITERAL;
                        break;
                    case 1 :
                        constraint.constraintValueType = IConstraint.TYPE_RET_VALUE;
                        break;
                    case 2 :
                        constraint.constraintValueType = IConstraint.TYPE_VARIABLE;
                        break;
                }
                modeller.reloadLhs();
                modeller.setDirty( true );
                close();
            }
        } );*/

        toolkit.paintBordersFor( composite );
        return composite;
    }

}
