package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C06H;
import X.C3089Bxt;
import X.C3UX;
import X.C7384Etj;
import X.C7m8;
import X.CFK;
import X.EGD;
import X.EnumC10460Hji;
import X.F31;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class WatchChatOpenReceiver extends BroadcastReceiver {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long OPEN_TIMEOUT_MS = 8000;
    public static final String TAG = "WatchChatOpen";
    public static final String WATCH_CHAT_URI = "hatch://chat";

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchChatOpenReceiver$onReceive$1", f = "WatchChatOpenReceiver.kt", l = {30}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchChatOpenReceiver$onReceive$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        public int label;
        public final /* synthetic */ WatchChatOpenReceiver this$0;

        @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchChatOpenReceiver$onReceive$1$1", f = "WatchChatOpenReceiver.kt", l = {30}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.watchhandoff.WatchChatOpenReceiver$onReceive$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04411 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $appContext;
            public int label;
            public final /* synthetic */ WatchChatOpenReceiver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04411(WatchChatOpenReceiver watchChatOpenReceiver, Context context, HtJ<? super C04411> htJ) {
                super(2, htJ);
                this.this$0 = watchChatOpenReceiver;
                this.$appContext = context;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C04411(this.this$0, this.$appContext, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    WatchChatOpenReceiver watchChatOpenReceiver = this.this$0;
                    Context context = this.$appContext;
                    C7384Etj.A0X(context);
                    this.label = 1;
                    if (watchChatOpenReceiver.openOnLinkedWatch(context, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C04411) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BroadcastReceiver.PendingResult pendingResult, WatchChatOpenReceiver watchChatOpenReceiver, Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$pendingResult = pendingResult;
            this.this$0 = watchChatOpenReceiver;
            this.$appContext = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$pendingResult, this.this$0, this.$appContext, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    try {
                        if (i == 0) {
                            Hwg.A00(obj);
                            C04411 c04411 = new C04411(this.this$0, this.$appContext, null);
                            this.label = 1;
                            obj = GAX.A01(this, c04411, 8000L);
                            if (obj == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        } else {
                            if (i != 1) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(obj);
                        }
                        if (((Unit) obj) == null) {
                            CFK.A06(WatchChatOpenReceiver.TAG, "Timed out opening the chat on the watch");
                        }
                    } catch (Exception e) {
                        CFK.A0K(WatchChatOpenReceiver.TAG, e, "Couldn't open the chat on the watch");
                    }
                    this.$pendingResult.finish();
                    return Unit.INSTANCE;
                } catch (CancellationException e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                this.$pendingResult.finish();
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchChatOpenReceiver", f = "WatchChatOpenReceiver.kt", l = {44, org.maplibre.android.R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "openOnLinkedWatch", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchChatOpenReceiver$openOnLinkedWatch$1, reason: invalid class name and case insensitive filesystem */
    public final class C143561 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C143561(HtJ<? super C143561> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchChatOpenReceiver.this.openOnLinkedWatch(null, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C7384Etj.A0Y(context, 0);
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(pendingResultGoAsync, this, applicationContext, null), F31.A00(C3089Bxt.A08));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openOnLinkedWatch(android.content.Context r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.watchhandoff.WatchChatOpenReceiver.C143561
            if (r0 == 0) goto L63
            r5 = r8
            com.facebook.aura.watchhandoff.WatchChatOpenReceiver$openOnLinkedWatch$1 r5 = (com.facebook.aura.watchhandoff.WatchChatOpenReceiver.C143561) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L40
            if (r0 != r4) goto L69
            X.Hwg.A00(r2)
        L23:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L26:
            X.Hwg.A00(r2)
            com.facebook.aura.watchhandoff.WatchSessionHandoffLink r0 = com.facebook.aura.watchhandoff.WatchSessionHandoffLink.INSTANCE
            java.lang.String r3 = r0.linkedWatchNode()
            if (r3 == 0) goto L23
            com.facebook.aura.watchlink.WatchLinkClient r0 = com.facebook.aura.watchlink.WatchLinkClient.INSTANCE
            r5.L$0 = r7
            r5.L$1 = r3
            r5.label = r1
            java.lang.Object r0 = r0.openChat(r7, r3, r5)
            if (r0 != r6) goto L4a
            return r6
        L40:
            java.lang.Object r3 = r5.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r5.L$0
            android.content.Context r7 = X.C60P.A02(r0, r2)
        L4a:
            com.facebook.aura.watchlink.WatchLinkClient r2 = com.facebook.aura.watchlink.WatchLinkClient.INSTANCE
            java.lang.String r0 = "hatch://chat"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            X.C7384Etj.A0U(r1)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r4
            java.lang.Object r0 = r2.startRemoteActivity(r7, r3, r1, r5)
            if (r0 != r6) goto L23
            return r6
        L63:
            com.facebook.aura.watchhandoff.WatchChatOpenReceiver$openOnLinkedWatch$1 r5 = new com.facebook.aura.watchhandoff.WatchChatOpenReceiver$openOnLinkedWatch$1
            r5.<init>(r8)
            goto L12
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchChatOpenReceiver.openOnLinkedWatch(android.content.Context, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final EGD action(Context context) {
            C7384Etj.A0Y(context, 0);
            String string = context.getString(com.facebook.aura.R.string._name_removed__res_0x7f121156);
            C7m8 c7m8 = new C7m8();
            c7m8.A04(new Intent(context, (Class<?>) WatchChatOpenReceiver.class), null);
            return new EGD(c7m8.A02(context, 0, 67108864), string, com.facebook.aura.R.drawable.smartwatch);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
