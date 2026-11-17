package com.facebook.aura.identity.provider;

import X.AbstractC7559F3s;
import X.C07779iq;
import X.C9hr;
import X.C9tS;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchChatThemesResponseJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<Map<String, ? extends HatchChatThemeOptionJson>>> {
    public static final HatchChatThemesResponseJson$Companion$$childSerializers$2 INSTANCE = new HatchChatThemesResponseJson$Companion$$childSerializers$2();

    public HatchChatThemesResponseJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<Map<String, ? extends HatchChatThemeOptionJson>> invoke() {
        return new C9tS(C07779iq.A01, HatchChatThemeOptionJson$$serializer.INSTANCE);
    }
}
