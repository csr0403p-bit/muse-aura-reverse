package com.facebook.aura.conversation.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9258GBl;
import X.C9286GCn;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class HatchPrimarySessionRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<String> _primarySessionId;
    public final InterfaceC2261BLa loadMutex;
    public final C1BN<String> primarySessionId;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchPrimarySessionRepository", f = "HatchPrimarySessionRepository.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT, R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "ensureLoaded", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$ensureLoaded$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPrimarySessionRepository.this.ensureLoaded(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$fetchPrimarySessionId$2", f = "HatchPrimarySessionRepository.kt", l = {86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$fetchPrimarySessionId$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPrimarySessionRepository.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchPrimarySessionRepository$fetchPrimarySessionId$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchPrimarySessionRepository$fetchPrimarySessionId$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchPrimarySessionRepository$fetchPrimarySessionId$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchPrimarySessionRepository$fetchPrimarySessionId$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, JarvisPath.PrimaryChat.INSTANCE, RequestType.GET, HatchPrimarySessionRepository.this.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = null;
            }
            PrimaryChatJson primaryChatJson = (PrimaryChatJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (primaryChatJson == null || (str = primaryChatJson.chat_id) == null || C7BY.A0j(str)) {
                return null;
            }
            return str;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return HatchPrimarySessionRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchPrimarySessionRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._primarySessionId = c9286GCnA13;
        this.primarySessionId = C3cG.A11(c9286GCnA13);
        this.loadMutex = new C9258GBl();
    }

    public final void setPrimarySessionId(String str) {
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str)) {
            return;
        }
        AnonymousClass002.A1I(this._primarySessionId, str);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._primarySessionId.Af8(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:31:0x0099, B:32:0x009c, B:34:0x00a0, B:37:0x00a6), top: B:46:0x0099 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ensureLoaded(X.HtJ<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.conversation.repo.HatchPrimarySessionRepository.AnonymousClass1
            if (r0 == 0) goto L26
            r7 = r10
            com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$ensureLoaded$1 r7 = (com.facebook.aura.conversation.repo.HatchPrimarySessionRepository.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r2 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 2
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L39
            if (r0 == r1) goto L31
            if (r0 != r6) goto L2c
            java.lang.Object r4 = r7.L$0
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            goto L99
        L26:
            com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$ensureLoaded$1 r7 = new com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$ensureLoaded$1
            r7.<init>(r10)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r4 = r7.L$0
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            X.Hwg.A00(r2)
            goto L51
        L39:
            X.Hwg.A00(r2)
            X.BLG<java.lang.String> r0 = r9._primarySessionId
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto Lba
            X.BLa r4 = r9.loadMutex
            r7.L$0 = r4
            r7.label = r1
            java.lang.Object r0 = r4.APs(r5, r7)
            if (r0 != r8) goto L51
            return r8
        L51:
            X.BLG<java.lang.String> r0 = r9._primarySessionId     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L5f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb2
            r4.Ahe(r5)
            return r0
        L5f:
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE     // Catch: java.lang.Throwable -> Lb2
            X.CGz r0 = r9.userSession     // Catch: java.lang.Throwable -> Lb2
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r1.getGateway(r0)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.aura.gateway.JarvisProtocol r0 = r0.protocol     // Catch: java.lang.Throwable -> Lb2
            X.1BN<java.lang.String> r3 = r0.primarySessionId     // Catch: java.lang.Throwable -> Lb2
            com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$ensureLoaded$2$fetched$1 r0 = new com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$ensureLoaded$2$fetched$1     // Catch: java.lang.Throwable -> Lb2
            r0.<init>(r9, r3, r5)     // Catch: java.lang.Throwable -> Lb2
            X.3ul r1 = new X.3ul     // Catch: java.lang.Throwable -> Lb2
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lb2
            if (r2 != 0) goto La6
            X.I0t r0 = new X.I0t     // Catch: java.lang.Throwable -> Lb2
            r0.<init>(r3, r6)     // Catch: java.lang.Throwable -> Lb2
            X.20Q[] r0 = new X.C20Q[]{r0, r1}     // Catch: java.lang.Throwable -> Lb2
            X.3ua r0 = X.AbstractC05633ui.A01(r0)     // Catch: java.lang.Throwable -> Lb2
            r7.L$0 = r4     // Catch: java.lang.Throwable -> Lb2
            r7.L$1 = r5     // Catch: java.lang.Throwable -> Lb2
            r7.L$2 = r5     // Catch: java.lang.Throwable -> Lb2
            r7.label = r6     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r2 = X.AbstractC9777Gfy.A02(r0, r7)     // Catch: java.lang.Throwable -> Lb2
            if (r2 != r8) goto L9c
            return r8
        L99:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> Lb0
        L9c:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lb0
            if (r2 != 0) goto La6
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb0
            r4.Ahe(r5)
            return r8
        La6:
            X.BLG<java.lang.String> r1 = r9._primarySessionId     // Catch: java.lang.Throwable -> Lb0
            X.GCn r1 = (X.C9286GCn) r1     // Catch: java.lang.Throwable -> Lb0
            X.HrH r0 = X.HwN.A01     // Catch: java.lang.Throwable -> Lb0
            X.C9286GCn.A00(r0, r2, r1)     // Catch: java.lang.Throwable -> Lb0
            goto Lb7
        Lb0:
            r0 = move-exception
            goto Lb3
        Lb2:
            r0 = move-exception
        Lb3:
            r4.Ahe(r5)
            throw r0
        Lb7:
            r4.Ahe(r5)
        Lba:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchPrimarySessionRepository.ensureLoaded(X.HtJ):java.lang.Object");
    }

    public final C1BN<String> getPrimarySessionId() {
        return this.primarySessionId;
    }

    public final class Companion {
        public final HatchPrimarySessionRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchPrimarySessionRepository) abstractC3358CGz.A03(HatchPrimarySessionRepository.class, new HatchPrimarySessionRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchPrimarySessionId(HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }
}
