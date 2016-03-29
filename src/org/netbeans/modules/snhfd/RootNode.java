package org.netbeans.modules.snhfd;

import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.modules.snhfd.level1.Level1ChildFactory;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.*;

@NbBundle.Messages("CTL_DisplayName=Root")
public class RootNode extends AbstractNode {

    @StaticResource
    private static final String ICON = "org/netbeans/modules/snhfd/icon.png";

    private static final RootNode DEFAULT = new RootNode();

    public static RootNode getDefault() {
        return DEFAULT;
    }
    
    public RootNode() {
        super(Children.create(new Level1ChildFactory(), true));
        setDisplayName(Bundle.CTL_DisplayName());
        setIconBaseWithExtension(ICON);
    }

}
