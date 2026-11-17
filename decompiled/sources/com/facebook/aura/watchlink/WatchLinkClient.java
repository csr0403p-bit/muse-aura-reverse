package com.facebook.aura.watchlink;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC4178Com;
import X.AbstractC4189Cp0;
import X.AbstractC4267Crq;
import X.AbstractC4272Cry;
import X.AbstractC7536F0j;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFI;
import X.BV4;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C4179Cop;
import X.C4182Cos;
import X.C4184Cou;
import X.C4234Cqv;
import X.C4276Cs4;
import X.C4278Cs8;
import X.C4287CsR;
import X.C4365CuK;
import X.C7384Etj;
import X.CFK;
import X.CRz;
import X.CSP;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC3641Caw;
import X.InterfaceC4097CmR;
import android.content.Context;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.google.android.gms.wearable.internal.zzhg;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class WatchLinkClient {
    public static final int $stable = 0;
    public static final String CHANGED_PATH = "/aura/watch/v1/changed";
    public static final WatchLinkClient INSTANCE = new WatchLinkClient();
    public static final String OPEN_CHAT_CAPABILITY = "aura_watch_open_chat_v1";
    public static final String OPEN_CHAT_PATH = "/aura/watch/v1/open_chat";
    public static final String PHONE_APP_CAPABILITY = "aura_phone_app";
    public static final String PHONE_CAPABILITY = "aura_phone_session_v1";
    public static final String SESSION_PATH = "/aura/watch/v1/session";
    public static final String STATUS_PATH = "/aura/watch/v1/status";
    public static final String WATCH_CAPABILITY = "aura_watch_session_v1";

    @DebugMetadata(c = "com.facebook.aura.watchlink.WatchLinkClient", f = "WatchLinkClient.kt", l = {57}, m = "connectedNodes", v = 2)
    /* renamed from: com.facebook.aura.watchlink.WatchLinkClient$connectedNodes$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchLinkClient.this.connectedNodes(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchlink.WatchLinkClient$connectedNodes$2", f = "WatchLinkClient.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchlink.WatchLinkClient$connectedNodes$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<InterfaceC3641Caw>>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super List<InterfaceC3641Caw>> htJ) {
            return new AnonymousClass2(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Context context = this.$context;
            C4276Cs4 c4276Cs4 = C4276Cs4.A02;
            return CRz.A00(new C4179Cop(context, C4278Cs8.A00, AbstractC4267Crq.A00, c4276Cs4).A05(), TimeUnit.SECONDS, 10L);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchlink.WatchLinkClient$nodes$2", f = "WatchLinkClient.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchlink.WatchLinkClient$nodes$2, reason: invalid class name and case insensitive filesystem */
    public final class C143582 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends InterfaceC3641Caw>>, Object> {
        public final /* synthetic */ String $capability;
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143582(Context context, String str, HtJ<? super C143582> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$capability = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C143582(this.$context, this.$capability, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                Context context = this.$context;
                C4276Cs4 c4276Cs4 = C4276Cs4.A02;
                Set<InterfaceC3641Caw> setAI8 = ((InterfaceC4097CmR) CRz.A00(new C4182Cos(context, C4278Cs8.A00, AbstractC4267Crq.A00, c4276Cs4).A05(this.$capability, 1), TimeUnit.SECONDS, 10L)).AI8();
                C7384Etj.A0U(setAI8);
                return AbstractC0878AGe.A0c(setAI8, new Comparator() { // from class: com.facebook.aura.watchlink.WatchLinkClient$nodes$2$invokeSuspend$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return AbstractC7536F0j.A00(((zzhg) ((InterfaceC3641Caw) t)).A00, ((zzhg) ((InterfaceC3641Caw) t2)).A00);
                    }
                });
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A("WatchSession", "Failed to discover watch session nodes", e2);
                throw e2;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super List<? extends InterfaceC3641Caw>> htJ) {
            return ((C143582) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchlink.WatchLinkClient", f = "WatchLinkClient.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "openChat", v = 2)
    /* renamed from: com.facebook.aura.watchlink.WatchLinkClient$openChat$1, reason: invalid class name and case insensitive filesystem */
    public final class C143591 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C143591(HtJ<? super C143591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchLinkClient.this.openChat(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchlink.WatchLinkClient$request$2", f = "WatchLinkClient.kt", l = {84}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchlink.WatchLinkClient$request$2, reason: invalid class name and case insensitive filesystem */
    public final class C143602 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super WatchLinkResponse>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $linkId;
        public final /* synthetic */ String $nodeId;
        public final /* synthetic */ String $path;
        public final /* synthetic */ String $rejectedTokenSha256;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143602(String str, String str2, String str3, Context context, String str4, HtJ<? super C143602> htJ) {
            super(2, htJ);
            this.$linkId = str;
            this.$rejectedTokenSha256 = str2;
            this.$path = str3;
            this.$context = context;
            this.$nodeId = str4;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C143602 c143602 = new C143602(this.$linkId, this.$rejectedTokenSha256, this.$path, this.$context, this.$nodeId, htJ);
            c143602.L$0 = obj;
            return c143602;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    WatchLinkClient$request$2$response$1 watchLinkClient$request$2$response$1 = new WatchLinkClient$request$2$response$1(this.$context, this.$nodeId, this.$path, C3cG.A1S(HatchJsonKt.HatchJson.A02(new WatchLinkRequest(this.$linkId, this.$rejectedTokenSha256), WatchLinkRequest$$serializer.INSTANCE)), null);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.label = 1;
                    obj = GAX.A01(this, watchLinkClient$request$2$response$1, 10000L);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    C3cG.A1G("Phone request timed out path=", this.$path, "WatchSession");
                    return null;
                }
                if (bArr.length > 65536) {
                    return null;
                }
                return (WatchLinkResponse) HatchJsonKt.HatchJson.A00(BV4.A0o(bArr), WatchLinkResponse$$serializer.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A06("WatchSession", FGI.A0d("Phone request failed path=", this.$path, " exception=", C3cI.A0Y(e2)));
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super WatchLinkResponse> htJ) {
            return ((C143602) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchlink.WatchLinkClient", f = "WatchLinkClient.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "startRemoteActivity", v = 2)
    /* renamed from: com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$1, reason: invalid class name and case insensitive filesystem */
    public final class C143611 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C143611(HtJ<? super C143611> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchLinkClient.this.startRemoteActivity(null, null, null, this);
        }
    }

    public static final void notifyChanged$lambda$0(Exception exc) {
        C7384Etj.A0Y(exc, 0);
        CFK.A0A("WatchSession", "Watch session change notification failed", exc);
    }

    public final String tokenSha256(String str) {
        C7384Etj.A0Y(str, 0);
        byte[] bArrA1T = C3cH.A1T(str);
        C7384Etj.A0U(bArrA1T);
        return BFI.A0C("", new G0U() { // from class: com.facebook.aura.watchlink.WatchLinkClient$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return C3cJ.A0K(Byte.valueOf(((Number) obj).byteValue()));
            }
        }, bArrA1T);
    }

    public static /* synthetic */ Object request$default(WatchLinkClient watchLinkClient, Context context, String str, String str2, String str3, String str4, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        return watchLinkClient.request(context, str, str2, str3, str4, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectedNodes(android.content.Context r7, X.HtJ<? super java.util.List<? extends X.InterfaceC3641Caw>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.watchlink.WatchLinkClient.AnonymousClass1
            if (r0 == 0) goto L3c
            r5 = r8
            com.facebook.aura.watchlink.WatchLinkClient$connectedNodes$1 r5 = (com.facebook.aura.watchlink.WatchLinkClient.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 != r3) goto L42
            X.Hwg.A00(r0)
        L20:
            X.C7384Etj.A0W(r0)
            return r0
        L24:
            X.Hwg.A00(r0)
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.watchlink.WatchLinkClient$connectedNodes$2 r0 = new com.facebook.aura.watchlink.WatchLinkClient$connectedNodes$2
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.watchlink.WatchLinkClient$connectedNodes$1 r5 = new com.facebook.aura.watchlink.WatchLinkClient$connectedNodes$1
            r5.<init>(r8)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchlink.WatchLinkClient.connectedNodes(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openChat(android.content.Context r8, java.lang.String r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.watchlink.WatchLinkClient.C143591
            if (r0 == 0) goto L58
            r5 = r10
            com.facebook.aura.watchlink.WatchLinkClient$openChat$1 r5 = (com.facebook.aura.watchlink.WatchLinkClient.C143591) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r7 = 1
            if (r0 == 0) goto L23
            if (r0 != r7) goto L5e
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L23:
            X.Hwg.A00(r1)
            X.Cs4 r3 = X.C4276Cs4.A02
            X.CrC<X.Cs8> r2 = X.AbstractC4267Crq.A00
            X.Cs8 r1 = X.C4278Cs8.A00
            X.Cqv r0 = new X.Cqv
            r0.<init>(r8, r1, r2, r3)
            r4 = 0
            byte[] r3 = new byte[r4]
            java.lang.String r2 = "/aura/watch/v1/open_chat"
            X.Cry r0 = r0.A05
            X.Cou r1 = new X.Cou
            r1.<init>(r0, r9, r2, r3)
            X.CuK r0 = (X.C4365CuK) r0
            X.Com r0 = r0.A00
            X.AbstractC4178Com.A03(r0, r1, r4)
            X.CsR r0 = X.C4287CsR.A00
            X.CSC r1 = X.AbstractC4189Cp0.A00(r1, r0)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r7
            java.lang.Object r0 = X.AbstractC3001Brc.A00(r1, r5)
            if (r0 != r6) goto L20
            return r6
        L58:
            com.facebook.aura.watchlink.WatchLinkClient$openChat$1 r5 = new com.facebook.aura.watchlink.WatchLinkClient$openChat$1
            r5.<init>(r10)
            goto L12
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchlink.WatchLinkClient.openChat(android.content.Context, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startRemoteActivity(android.content.Context r7, java.lang.String r8, android.net.Uri r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.watchlink.WatchLinkClient.C143611
            if (r0 == 0) goto L84
            r5 = r10
            com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$1 r5 = (com.facebook.aura.watchlink.WatchLinkClient.C143611) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r6 = 1
            if (r0 == 0) goto L23
            if (r0 != r6) goto L8a
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r9)
            r0 = 13
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.Intent r1 = r1.addCategory(r0)
            java.lang.String r0 = r7.getPackageName()
            android.content.Intent r3 = r1.setPackage(r0)
            X.C7384Etj.A0U(r3)
            android.content.Context r1 = X.AnonymousClass001.A0I(r7)
            com.facebook.aura.watchlink.WatchLinkClient$$ExternalSyntheticLambda2 r0 = new com.facebook.aura.watchlink.WatchLinkClient$$ExternalSyntheticLambda2
            r0.<init>()
            X.CwA r2 = new X.CwA
            r2.<init>(r1, r0)
            r1 = 0
            X.E91 r0 = new X.E91
            r0.<init>(r3, r2, r8, r1)
            X.Brr r3 = X.AbstractC2947Bpi.A00(r0)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.L$4 = r3
            r5.label = r6
            X.GBL r2 = X.C7Bm.A04(r5)
            com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$1 r0 = new com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$1
            r0.<init>()
            r2.AO2(r0)
            com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$2 r1 = new com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$2
            r1.<init>()
            com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3 r0 = new java.util.concurrent.Executor() { // from class: com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3
                static {
                    /*
                        com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3 r0 = new com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3) com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3.INSTANCE com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3.<init>():void");
                }

                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable r1) {
                    /*
                        r0 = this;
                        r1.run()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$2$3.execute(java.lang.Runnable):void");
                }
            }
            r3.addListener(r1, r0)
            java.lang.Object r0 = r2.A0F()
            if (r0 != r4) goto L20
            return r4
        L84:
            com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$1 r5 = new com.facebook.aura.watchlink.WatchLinkClient$startRemoteActivity$1
            r5.<init>(r10)
            goto L12
        L8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchlink.WatchLinkClient.startRemoteActivity(android.content.Context, java.lang.String, android.net.Uri, X.HtJ):java.lang.Object");
    }

    public final Object nodes(Context context, String str, HtJ<? super List<? extends InterfaceC3641Caw>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C143582(context, str, null));
    }

    public final void notifyChanged(Context context, String str) {
        int iA1b = AnonymousClass004.A1b(context, str);
        C4276Cs4 c4276Cs4 = C4276Cs4.A02;
        AbstractC4272Cry abstractC4272Cry = new C4234Cqv(context, C4278Cs8.A00, AbstractC4267Crq.A00, c4276Cs4).A05;
        C4184Cou c4184Cou = new C4184Cou(abstractC4272Cry, str, CHANGED_PATH, new byte[iA1b]);
        AbstractC4178Com.A03(((C4365CuK) abstractC4272Cry).A00, c4184Cou, iA1b);
        AbstractC4189Cp0.A00(c4184Cou, C4287CsR.A00).A0E(new CSP() { // from class: com.facebook.aura.watchlink.WatchLinkClient$$ExternalSyntheticLambda1
            @Override // X.CSP
            public final void onFailure(Exception exc) {
                WatchLinkClient.notifyChanged$lambda$0(exc);
            }
        });
    }

    public final Object request(Context context, String str, String str2, String str3, String str4, HtJ<? super WatchLinkResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C143602(str3, str4, str2, context, str, null));
    }
}
