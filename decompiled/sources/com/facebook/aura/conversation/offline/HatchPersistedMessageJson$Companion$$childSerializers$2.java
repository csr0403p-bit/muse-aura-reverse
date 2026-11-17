package com.facebook.aura.conversation.offline;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import com.facebook.aura.model.HatchCitation;
import com.facebook.aura.model.HatchCitation$$serializer;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchPersistedMessageJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends HatchCitation>>> {
    public static final HatchPersistedMessageJson$Companion$$childSerializers$2 INSTANCE = new HatchPersistedMessageJson$Companion$$childSerializers$2();

    public HatchPersistedMessageJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends HatchCitation>> invoke() {
        return C3cG.A19(HatchCitation$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends HatchCitation>> invoke() {
        return C3cG.A19(HatchCitation$$serializer.INSTANCE);
    }
}
