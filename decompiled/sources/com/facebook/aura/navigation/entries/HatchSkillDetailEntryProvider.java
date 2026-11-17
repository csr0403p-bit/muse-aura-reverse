package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C5rn;
import X.G0U;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.HatchSkillDetailScreenKey;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchSkillDetailEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchSkillDetailEntryProvider INSTANCE = new HatchSkillDetailEntryProvider();

    /* renamed from: com.facebook.aura.navigation.entries.HatchSkillDetailEntryProvider$provideEntry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchSkillDetailScreenKey, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HatchSkillDetailScreenKey hatchSkillDetailScreenKey) {
            return HatchSkillDetailEntryProviderKt.HATCH_SKILL_DETAIL_CONTENT_KEY;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HatchSkillDetailScreenKey hatchSkillDetailScreenKey) {
            return HatchSkillDetailEntryProviderKt.HATCH_SKILL_DETAIL_CONTENT_KEY;
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        c5rn.A00(AnonymousClass1.INSTANCE, new G0U<HatchSkillDetailScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.HatchSkillDetailEntryProvider$provideEntry$$inlined$entry$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchSkillDetailScreenKey hatchSkillDetailScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchSkillDetailScreenKey hatchSkillDetailScreenKey) {
                return mapA0o;
            }
        }, ComposableSingletons$HatchSkillDetailEntryProviderKt.f136lambda$1271814836, C3cG.A0x(HatchSkillDetailScreenKey.class));
    }
}
