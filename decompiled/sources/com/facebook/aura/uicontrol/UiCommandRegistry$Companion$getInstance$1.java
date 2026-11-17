package com.facebook.aura.uicontrol;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3cG;
import com.facebook.aura.nodes.api.HatchClientCapabilities;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class UiCommandRegistry$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<UiCommandRegistry> {
    public static final UiCommandRegistry$Companion$getInstance$1 INSTANCE = new UiCommandRegistry$Companion$getInstance$1();

    public UiCommandRegistry$Companion$getInstance$1() {
        super(0);
    }

    /* renamed from: com.facebook.aura.uicontrol.UiCommandRegistry$Companion$getInstance$1$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Map<String, ? extends NodeCommandSpec>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends NodeCommandSpec> invoke() {
            Map mapA07 = AGH.A07(UiCommandRegistryKt.gatedOffUiCommandIds(), UiCommandSpecsKt.uiCommandSpecs());
            HatchClientCapabilities hatchClientCapabilities = HatchClientCapabilities.INSTANCE;
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0n = AnonymousClass002.A0n(mapA07);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                if (hatchClientCapabilities.supportsUiCommand((String) entry.getKey())) {
                    linkedHashMapA0j.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMapA0j;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final UiCommandRegistry invoke() {
        return new UiCommandRegistry(AnonymousClass1.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ UiCommandRegistry invoke() {
        return new UiCommandRegistry(AnonymousClass1.INSTANCE);
    }
}
