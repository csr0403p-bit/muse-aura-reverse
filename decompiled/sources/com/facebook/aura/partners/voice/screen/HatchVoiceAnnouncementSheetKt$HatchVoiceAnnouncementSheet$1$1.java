package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchVoiceAnnouncementSheetKey;

/* loaded from: classes2.dex */
public final class HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<AuraNavigator> $navigator$delegate;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof HatchVoiceAnnouncementSheetKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$1$1(C1BO<? extends AuraNavigator> c1bo) {
        super(1);
        this.$navigator$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$navigator$delegate.getValue().popAll(AnonymousClass1.INSTANCE);
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
