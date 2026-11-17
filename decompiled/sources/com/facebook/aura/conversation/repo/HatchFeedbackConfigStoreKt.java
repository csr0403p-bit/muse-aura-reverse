package com.facebook.aura.conversation.repo;

import X.A3W;
import X.A6B;
import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass604;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class HatchFeedbackConfigStoreKt {

    /* renamed from: com.facebook.aura.conversation.repo.HatchFeedbackConfigStoreKt$toDisplayOptions$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final String invoke(String str) {
            C7384Etj.A0Y(str, 0);
            return C7BY.A0F(str).toString();
        }
    }

    /* renamed from: com.facebook.aura.conversation.repo.HatchFeedbackConfigStoreKt$toDisplayOptions$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(String str) {
            C7384Etj.A0Y(str, 0);
            return Boolean.valueOf(str.length() > 0);
        }
    }

    public static final String orEmptyIfBlank(String str) {
        String strA0l;
        return (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) ? "" : strA0l;
    }

    public static final HatchFeedbackConfig toConfig(StefiFeedbackConfigResponseJson stefiFeedbackConfigResponseJson) {
        return new HatchFeedbackConfig(stefiFeedbackConfigResponseJson.enable_good_feedback, stefiFeedbackConfigResponseJson.enable_bad_feedback, orEmptyIfBlank(stefiFeedbackConfigResponseJson.good_response_label), orEmptyIfBlank(stefiFeedbackConfigResponseJson.bad_response_label), toDisplayOptions(stefiFeedbackConfigResponseJson.good_feedback_options), toDisplayOptions(stefiFeedbackConfigResponseJson.bad_feedback_options));
    }

    public static final AHD<String> toDisplayOptions(List<String> list) {
        return AGI.A0D(new A3W(new AnonymousClass604(3), A6B.A03(AnonymousClass2.INSTANCE, A6B.A08(AnonymousClass1.INSTANCE, AbstractC0878AGe.A06(list)))));
    }
}
