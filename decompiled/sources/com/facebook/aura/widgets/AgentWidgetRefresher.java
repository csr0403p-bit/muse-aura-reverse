package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C6JZ;
import X.C6O2;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class AgentWidgetRefresher {
    public static final int $stable = 0;
    public static final AgentWidgetRefresher INSTANCE = new AgentWidgetRefresher();

    @DebugMetadata(c = "com.facebook.aura.widgets.AgentWidgetRefresher", f = "AgentWidgetRefresher.kt", l = {18, 21, 23, 32, 40, 42}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.widgets.AgentWidgetRefresher$refresh$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AgentWidgetRefresher.this.refresh(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.AgentWidgetRefresher$refresh$2", f = "AgentWidgetRefresher.kt", l = {23}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.AgentWidgetRefresher$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ AgentWidget $widget;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AgentWidget agentWidget, Context context, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$widget = agentWidget;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass2(this.$widget, this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AgentWidget agentWidget = this.$widget;
                Context context = this.$context;
                this.label = 1;
                if (agentWidget.showSignedOut(context, this) == enumC10460Hji) {
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.AgentWidgetRefresher$refresh$3", f = "AgentWidgetRefresher.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.AgentWidgetRefresher$refresh$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Bitmap $avatar;
        public final /* synthetic */ String $avatarSource;
        public final /* synthetic */ String $batch;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ long $generation;
        public final /* synthetic */ boolean $isCallSupported;
        public final /* synthetic */ String $name;
        public final /* synthetic */ AgentWidgetStore $store;
        public final /* synthetic */ String $tabs;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ AgentWidget $widget;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.widgets.AgentWidgetRefresher$refresh$3$1", f = "AgentWidgetRefresher.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop, 48}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.widgets.AgentWidgetRefresher$refresh$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Bitmap $avatar;
            public final /* synthetic */ String $avatarSource;
            public final /* synthetic */ String $batch;
            public final /* synthetic */ Context $context;
            public final /* synthetic */ long $generation;
            public final /* synthetic */ boolean $isCallSupported;
            public final /* synthetic */ String $name;
            public final /* synthetic */ AgentWidgetStore $store;
            public final /* synthetic */ String $tabs;
            public final /* synthetic */ AbstractC3358CGz $userSession;
            public Object L$0;
            public int label;

            /* renamed from: com.facebook.aura.widgets.AgentWidgetRefresher$refresh$3$1$1, reason: invalid class name and collision with other inner class name */
            public final class C04441 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
                public final /* synthetic */ String $avatarFile;
                public final /* synthetic */ String $avatarSource;
                public final /* synthetic */ boolean $isCallSupported;
                public final /* synthetic */ String $name;
                public final /* synthetic */ String $tabs;

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(C6O2 c6o2) {
                    C7384Etj.A0Y(c6o2, 0);
                    C6O2.A02(c6o2, AgentWidgetStore.SIGNED_OUT, false);
                    c6o2.A08(AgentWidgetStore.NAME, this.$name);
                    c6o2.A08(AgentWidgetStore.TABS, this.$tabs);
                    C6O2.A02(c6o2, AgentWidgetStore.CALL_SUPPORTED, this.$isCallSupported);
                    String str = this.$avatarSource;
                    C6JZ<String> c6jz = AgentWidgetStore.AVATAR_SOURCE;
                    if (str != null) {
                        c6o2.A08(c6jz, str);
                    } else {
                        c6o2.A07(c6jz);
                    }
                    String str2 = this.$avatarFile;
                    C6JZ<String> c6jz2 = AgentWidgetStore.AVATAR_FILE;
                    if (str2 != null) {
                        c6o2.A08(c6jz2, str2);
                    } else {
                        c6o2.A07(c6jz2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04441(String str, String str2, boolean z, String str3, String str4) {
                    super(1);
                    this.$name = str;
                    this.$tabs = str2;
                    this.$isCallSupported = z;
                    this.$avatarSource = str3;
                    this.$avatarFile = str4;
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
                    invoke2(c6o2);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[RETURN] */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    r10 = r13
                    X.Hji r1 = X.EnumC10460Hji.A02
                    int r0 = r12.label
                    r2 = 2
                    r5 = 1
                    if (r0 == 0) goto L1c
                    if (r0 == r5) goto L4d
                    if (r0 != r2) goto L6f
                    X.Hwg.A00(r13)
                L10:
                    com.facebook.aura.widgets.AgentWidgetStore r2 = r12.$store
                    android.content.Context r1 = r12.$context
                    java.lang.String r0 = r12.$batch
                    r2.deleteAvatarsExcept(r1, r0)
                L19:
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    return r1
                L1c:
                    X.Hwg.A00(r13)
                    X.CGz r0 = r12.$userSession
                    boolean r0 = com.facebook.aura.widgets.WidgetSessionKt.isCurrentWidgetSession(r0)
                    if (r0 == 0) goto L19
                    com.facebook.aura.widgets.AgentWidgetStore r0 = r12.$store
                    com.facebook.aura.widgets.WidgetFileStore r0 = r0.avatars
                    long r3 = r0.generation()
                    long r10 = r12.$generation
                    int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                    if (r0 != 0) goto L19
                    android.graphics.Bitmap r9 = r12.$avatar
                    if (r9 == 0) goto L4b
                    com.facebook.aura.widgets.AgentWidgetStore r6 = r12.$store
                    android.content.Context r7 = r12.$context
                    java.lang.String r8 = r12.$batch
                    r0 = 0
                    r12.L$0 = r0
                    r12.label = r5
                    java.lang.Object r10 = r6.saveAvatar(r7, r8, r9, r10, r12)
                    if (r10 != r1) goto L50
                    return r1
                L4b:
                    r10 = 0
                    goto L52
                L4d:
                    X.Hwg.A00(r13)
                L50:
                    java.lang.String r10 = (java.lang.String) r10
                L52:
                    com.facebook.aura.widgets.AgentWidgetStore r4 = r12.$store
                    android.content.Context r3 = r12.$context
                    java.lang.String r6 = r12.$name
                    java.lang.String r7 = r12.$tabs
                    boolean r8 = r12.$isCallSupported
                    java.lang.String r9 = r12.$avatarSource
                    com.facebook.aura.widgets.AgentWidgetRefresher$refresh$3$1$1 r5 = new com.facebook.aura.widgets.AgentWidgetRefresher$refresh$3$1$1
                    r5.<init>(r6, r7, r8, r9, r10)
                    r0 = 0
                    r12.L$0 = r0
                    r12.label = r2
                    java.lang.Object r0 = r4.editAll(r3, r5, r12)
                    if (r0 != r1) goto L10
                    return r1
                L6f:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.AgentWidgetRefresher.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, AgentWidgetStore agentWidgetStore, long j, Bitmap bitmap, Context context, String str, String str2, String str3, boolean z, String str4, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.$userSession = abstractC3358CGz;
                this.$store = agentWidgetStore;
                this.$generation = j;
                this.$avatar = bitmap;
                this.$context = context;
                this.$batch = str;
                this.$name = str2;
                this.$tabs = str3;
                this.$isCallSupported = z;
                this.$avatarSource = str4;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.$userSession, this.$store, this.$generation, this.$avatar, this.$context, this.$batch, this.$name, this.$tabs, this.$isCallSupported, this.$avatarSource, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, AgentWidget agentWidget, AbstractC3358CGz abstractC3358CGz, AgentWidgetStore agentWidgetStore, long j, Bitmap bitmap, String str, String str2, String str3, boolean z, String str4, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$widget = agentWidget;
            this.$userSession = abstractC3358CGz;
            this.$store = agentWidgetStore;
            this.$generation = j;
            this.$avatar = bitmap;
            this.$batch = str;
            this.$name = str2;
            this.$tabs = str3;
            this.$isCallSupported = z;
            this.$avatarSource = str4;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$context, this.$widget, this.$userSession, this.$store, this.$generation, this.$avatar, this.$batch, this.$name, this.$tabs, this.$isCallSupported, this.$avatarSource, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return obj;
            }
            Hwg.A00(obj);
            WidgetContentLock widgetContentLock = WidgetContentLock.INSTANCE;
            Context context = this.$context;
            Class<? extends GlanceAppWidgetReceiver> receiver = this.$widget.getReceiver();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userSession, this.$store, this.$generation, this.$avatar, this.$context, this.$batch, this.$name, this.$tabs, this.$isCallSupported, this.$avatarSource, null);
            this.label = 1;
            Object objWriteIfEnabled = widgetContentLock.writeIfEnabled(context, receiver, anonymousClass1, this);
            return objWriteIfEnabled == enumC10460Hji ? enumC10460Hji : objWriteIfEnabled;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x012a, code lost:
    
        if (r2 == r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018b, code lost:
    
        if (androidx.datastore.preferences.core.Preferences.A03(com.facebook.aura.widgets.AgentWidgetStore.CALL_SUPPORTED, r2, r9) == r5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x018b -> B:42:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(android.content.Context r21, com.facebook.aura.widgets.AgentWidget r22, X.HtJ<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.AgentWidgetRefresher.refresh(android.content.Context, com.facebook.aura.widgets.AgentWidget, X.HtJ):java.lang.Object");
    }
}
