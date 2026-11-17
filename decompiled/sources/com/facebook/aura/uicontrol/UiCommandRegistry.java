package com.facebook.aura.uicontrol;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class UiCommandRegistry {
    public static final Companion Companion = new Companion();
    public final Function0<Map<String, NodeCommandSpec>> specsSource;

    /* JADX WARN: Multi-variable type inference failed */
    public UiCommandRegistry(Function0<? extends Map<String, NodeCommandSpec>> function0) {
        C7384Etj.A0Y(function0, 0);
        this.specsSource = function0;
    }

    public final Map<String, NodeCommandSpec> specs() {
        return this.specsSource.invoke();
    }

    public final class Companion {
        public final UiCommandRegistry forTesting(Map<String, NodeCommandSpec> map) {
            C7384Etj.A0Y(map, 0);
            return new UiCommandRegistry(new UiCommandRegistry$Companion$forTesting$1(map));
        }

        public final UiCommandRegistry getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (UiCommandRegistry) abstractC3358CGz.A03(UiCommandRegistry.class, UiCommandRegistry$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
