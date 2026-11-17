package com.facebook.aura.conversation.offline;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import com.facebook.aura.model.HatchTextEntitySegment;
import com.facebook.aura.model.HatchTextEntitySegment$$serializer;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchPersistedMessageJson$Companion$$childSerializers$6 extends AbstractC7559F3s implements Function0<C9hr<List<? extends HatchTextEntitySegment>>> {
    public static final HatchPersistedMessageJson$Companion$$childSerializers$6 INSTANCE = new HatchPersistedMessageJson$Companion$$childSerializers$6();

    public HatchPersistedMessageJson$Companion$$childSerializers$6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends HatchTextEntitySegment>> invoke() {
        return C3cG.A19(HatchTextEntitySegment$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends HatchTextEntitySegment>> invoke() {
        return C3cG.A19(HatchTextEntitySegment$$serializer.INSTANCE);
    }
}
