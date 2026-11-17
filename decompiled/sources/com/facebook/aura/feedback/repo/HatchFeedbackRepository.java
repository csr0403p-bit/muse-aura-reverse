package com.facebook.aura.feedback.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C06H;
import X.C7384Etj;
import X.CFK;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchFeedbackRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.feedback.repo.HatchFeedbackRepository", f = "HatchFeedbackRepository.kt", l = {154}, m = BrowserOperationCatalogKt.SUBMIT, v = 2)
    /* renamed from: com.facebook.aura.feedback.repo.HatchFeedbackRepository$submit$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFeedbackRepository.this.submit(null, null, null, this);
        }
    }

    private final String normalizeReason(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(HatchFeedbackRepositoryKt.REASON_WHITESPACE.A03(str, InviteCodeScratcherKt.CODE_SEPARATOR))) == null) {
            strA0l = "";
        }
        int length = strA0l.length();
        if (length != 0) {
            if (strA0l.codePointCount(0, length) <= 600) {
                return strA0l;
            }
            CFK.A0H(HatchFeedbackRepositoryKt.TAG, "reason over %d chars, dropping it", 600);
        }
        return null;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submit(com.facebook.aura.feedback.FeedbackTarget r25, com.facebook.aura.feedback.FeedbackVerdict r26, java.lang.String r27, X.HtJ<? super com.facebook.aura.feedback.FeedbackResult> r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feedback.repo.HatchFeedbackRepository.submit(com.facebook.aura.feedback.FeedbackTarget, com.facebook.aura.feedback.FeedbackVerdict, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchFeedbackRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchFeedbackRepository) abstractC3358CGz.A03(HatchFeedbackRepository.class, new HatchFeedbackRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchFeedbackRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public HatchFeedbackRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
    }
}
