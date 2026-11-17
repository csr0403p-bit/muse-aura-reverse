package com.facebook.aura.conversation.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchFeedbackConfigStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<HatchFeedbackConfig> _config;
    public final C1BN<HatchFeedbackConfig> config;

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchFeedbackConfigStore", f = "HatchFeedbackConfigStore.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchFeedbackConfigStore$refresh$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFeedbackConfigStore.this.refresh(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchFeedbackConfigStore$refresh$2", f = "HatchFeedbackConfigStore.kt", l = {116}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchFeedbackConfigStore$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends StefiFeedbackConfigResponseJson>>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchFeedbackConfigStore.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends StefiFeedbackConfigResponseJson>> htJ) {
            return invoke2(c3ux, (HtJ<? super HsJ<StefiFeedbackConfigResponseJson>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                StefiHatchPath.FeedbackConfig feedbackConfig = StefiHatchPath.FeedbackConfig.INSTANCE;
                RequestType requestType = RequestType.GET;
                C9jH c9jHA0E = AGH.A0E();
                HatchFeedbackConfigStore$refresh$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 hatchFeedbackConfigStore$refresh$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = HatchFeedbackConfigStore$refresh$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(hatchFeedbackConfigStore$refresh$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, feedbackConfig, requestType, null, null, c9jHA0E, c9jHA0E, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
            }
            HatchFeedbackConfigStore hatchFeedbackConfigStore = HatchFeedbackConfigStore.this;
            if (!(objM1596executeBodylessStefiRequestWithtZkwj4A instanceof C10571Hud)) {
                hatchFeedbackConfigStore._config.Af8(HatchFeedbackConfigStoreKt.toConfig((StefiFeedbackConfigResponseJson) objM1596executeBodylessStefiRequestWithtZkwj4A));
            }
            return new HsJ(objM1596executeBodylessStefiRequestWithtZkwj4A);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<StefiFeedbackConfigResponseJson>> htJ) {
            return HatchFeedbackConfigStore.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._config.Af8(HatchFeedbackConfig.HIDDEN);
    }

    public final C1BN<HatchFeedbackConfig> getConfig() {
        return this.config;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.conversation.repo.HatchFeedbackConfigStore.AnonymousClass1
            if (r0 == 0) goto L36
            r5 = r7
            com.facebook.aura.conversation.repo.HatchFeedbackConfigStore$refresh$1 r5 = (com.facebook.aura.conversation.repo.HatchFeedbackConfigStore.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3c
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.conversation.repo.HatchFeedbackConfigStore$refresh$2 r0 = new com.facebook.aura.conversation.repo.HatchFeedbackConfigStore$refresh$2
            r0.<init>(r1)
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L36:
            com.facebook.aura.conversation.repo.HatchFeedbackConfigStore$refresh$1 r5 = new com.facebook.aura.conversation.repo.HatchFeedbackConfigStore$refresh$1
            r5.<init>(r7)
            goto L12
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchFeedbackConfigStore.refresh(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchFeedbackConfigStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchFeedbackConfigStore) abstractC3358CGz.A03(HatchFeedbackConfigStore.class, HatchFeedbackConfigStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchFeedbackConfigStore(C06H c06h) {
        this();
    }

    public HatchFeedbackConfigStore() {
        C9286GCn c9286GCnA01 = HnJ.A01(HatchFeedbackConfig.HIDDEN);
        this._config = c9286GCnA01;
        this.config = C3Pi.A00(c9286GCnA01);
    }
}
