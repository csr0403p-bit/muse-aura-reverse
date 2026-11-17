package com.facebook.aura.identity.provider;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BFI;
import X.BFM;
import X.BGK;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C27k;
import X.C2CK;
import X.C3Ej;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3pU;
import X.C3rb;
import X.C4oT;
import X.C60I;
import X.C6ys;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.C7BY;
import X.C9258GBl;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.F1F;
import X.F2X;
import X.FGI;
import X.G0V;
import X.G0W;
import X.GAo;
import X.GDB;
import X.HnJ;
import X.Ht9;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzC;
import X.HzP;
import X.HzS;
import X.InterfaceC2261BLa;
import X.InterfaceC2349BUy;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.avatarassets.appearance.HatchAvatarAppearance;
import com.facebook.aura.avatarassets.appearance.HatchAvatarAppearanceKt;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.common.video.HatchVideoPrefetcher;
import com.facebook.aura.gateway.AvatarMediaUrlsKt;
import com.facebook.aura.gateway.HatchAiIdentityHandler;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchStatusVideoCache;
import com.facebook.aura.gateway.ThemeUpdateEvent;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.identity.provider.HatchIcon;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarMediaSelectionKt;
import com.facebook.aura.model.AvatarStatusVideos;
import com.facebook.aura.model.AvatarVideoVariant;
import com.facebook.aura.qpl.module.MC;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchIdentityProvider implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<HatchChatThemesState> _chatThemes;
    public final C1BN<AiIdentity> aiIdentity;
    public final C1BN<String> aiIdentityName;
    public final C1BN<AvatarMedia> avatarMedia;
    public final C1BN<Uri> cachedAvatarUri;
    public final BLG<Map<String, Uri>> cachedStills;
    public final C1BN<HatchChatThemesState> chatThemes;
    public C27k<Unit> chatThemesFetchJob;
    public final InterfaceC2261BLa chatThemesFetchMutex;
    public final C1BN<HatchConversationTheme> conversationTheme;
    public final HatchGatewayConnection gateway;
    public final HatchGatewayPrefsStore gatewayPrefs;
    public final C3UX scope;
    public final HatchStatusVideoCache statusVideoCache;
    public final Object stillFilesLock;
    public volatile boolean userDataCleared;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$1", f = "HatchIdentityProvider.kt", l = {156}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$1$1", f = "HatchIdentityProvider.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01861 extends AbstractC07127nr implements G0W<AvatarMedia, Boolean, HtJ<? super HxE<? extends List<? extends HxE<? extends String, ? extends Boolean>>, ? extends Set<? extends String>>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ HatchIdentityProvider this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01861(HatchIdentityProvider hatchIdentityProvider, HtJ<? super C01861> htJ) {
                super(3, htJ);
                this.this$0 = hatchIdentityProvider;
            }

            public final Object invoke(AvatarMedia avatarMedia, boolean z, HtJ<? super HxE<? extends List<HxE<String, Boolean>>, ? extends Set<String>>> htJ) {
                C01861 c01861 = new C01861(this.this$0, htJ);
                c01861.L$0 = avatarMedia;
                c01861.Z$0 = z;
                return c01861.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                AvatarMedia avatarMedia = (AvatarMedia) this.L$0;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return C3cG.A0r(this.this$0.stillCandidates(avatarMedia, z), this.this$0.currentStillFiles(avatarMedia));
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(AvatarMedia avatarMedia, Boolean bool, HtJ<? super HxE<? extends List<? extends HxE<? extends String, ? extends Boolean>>, ? extends Set<? extends String>>> htJ) {
                return invoke(avatarMedia, AnonymousClass001.A1X(bool), (HtJ<? super HxE<? extends List<HxE<String, Boolean>>, ? extends Set<String>>>) htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$1$2", f = "HatchIdentityProvider.kt", l = {158}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HxE<? extends List<? extends HxE<? extends String, ? extends Boolean>>, ? extends Set<? extends String>>, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public Object L$5;
            public Object L$6;
            public Object L$7;
            public boolean Z$0;
            public int label;
            public final /* synthetic */ HatchIdentityProvider this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchIdentityProvider hatchIdentityProvider, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = hatchIdentityProvider;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, htJ);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(HxE<? extends List<? extends HxE<? extends String, ? extends Boolean>>, ? extends Set<? extends String>> hxE, HtJ<? super Unit> htJ) {
                return invoke2((HxE<? extends List<HxE<String, Boolean>>, ? extends Set<String>>) hxE, htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[PHI: r5 r6 r9
  0x0038: PHI (r5v2 java.util.Set) = (r5v1 java.util.Set), (r5v3 java.util.Set) binds: [B:10:0x0027, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r6v1 com.facebook.aura.identity.provider.HatchIdentityProvider) = 
  (r6v0 com.facebook.aura.identity.provider.HatchIdentityProvider)
  (r6v2 com.facebook.aura.identity.provider.HatchIdentityProvider)
 binds: [B:10:0x0027, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r9v1 java.util.Iterator) = (r9v0 java.util.Iterator), (r9v2 java.util.Iterator) binds: [B:10:0x0027, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006e -> B:6:0x001c). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r1 = r10.L$0
                    X.HxE r1 = (X.HxE) r1
                    X.Hji r8 = X.EnumC10460Hji.A02
                    int r0 = r10.label
                    r7 = 1
                    if (r0 == 0) goto L27
                    if (r0 != r7) goto L71
                    java.lang.Object r9 = r10.L$5
                    java.util.Iterator r9 = (java.util.Iterator) r9
                    java.lang.Object r6 = r10.L$4
                    com.facebook.aura.identity.provider.HatchIdentityProvider r6 = (com.facebook.aura.identity.provider.HatchIdentityProvider) r6
                    java.lang.Object r5 = r10.L$2
                    java.util.Set r5 = (java.util.Set) r5
                    X.Hwg.A00(r11)
                L1c:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r0 = r11.booleanValue()
                    if (r0 == 0) goto L38
                L24:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                L27:
                    X.Hwg.A00(r11)
                    A r0 = r1.first
                    java.util.List r0 = (java.util.List) r0
                    B r5 = r1.second
                    java.util.Set r5 = (java.util.Set) r5
                    com.facebook.aura.identity.provider.HatchIdentityProvider r6 = r10.this$0
                    java.util.Iterator r9 = r0.iterator()
                L38:
                    boolean r0 = r9.hasNext()
                    if (r0 == 0) goto L24
                    java.lang.Object r4 = r9.next()
                    r0 = r4
                    X.HxE r0 = (X.HxE) r0
                    A r3 = r0.first
                    java.lang.String r3 = (java.lang.String) r3
                    B r0 = r0.second
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r2 = r0.booleanValue()
                    java.lang.String r1 = com.facebook.aura.identity.provider.HatchIdentityProviderKt.stillFileName(r3, r2)
                    r0 = 0
                    r10.L$0 = r0
                    r10.L$1 = r0
                    r10.L$2 = r5
                    r10.L$3 = r0
                    r10.L$4 = r6
                    r10.L$5 = r9
                    r10.L$6 = r4
                    r10.L$7 = r0
                    r10.Z$0 = r2
                    r10.label = r7
                    java.lang.Object r11 = com.facebook.aura.identity.provider.HatchIdentityProvider.access$downloadAndCacheAvatar(r6, r3, r1, r5, r10)
                    if (r11 != r8) goto L1c
                    return r8
                L71:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.identity.provider.HatchIdentityProvider.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HxE<? extends List<HxE<String, Boolean>>, ? extends Set<String>> hxE, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchIdentityProvider.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA04 = C3rb.A04(new C01861(HatchIdentityProvider.this, null), HatchIdentityProvider.this.avatarMedia, HatchAvatarAppearance.INSTANCE.isDarkFlow());
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HatchIdentityProvider.this, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, c20qA04) == enumC10460Hji) {
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
            return HatchIdentityProvider.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$2", f = "HatchIdentityProvider.kt", l = {169}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$2$1", f = "HatchIdentityProvider.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<AvatarMedia, Boolean, HtJ<? super AvatarStatusVideos>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ HatchIdentityProvider this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchIdentityProvider hatchIdentityProvider, HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
                this.this$0 = hatchIdentityProvider;
            }

            public final Object invoke(AvatarMedia avatarMedia, boolean z, HtJ<? super AvatarStatusVideos> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ);
                anonymousClass1.L$0 = avatarMedia;
                anonymousClass1.Z$0 = z;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                AvatarMedia avatarMedia = (AvatarMedia) this.L$0;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return AvatarMediaUrlsKt.statusVideos(AvatarMediaSelectionKt.select(avatarMedia, z), this.this$0.userSession);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(AvatarMedia avatarMedia, Boolean bool, HtJ<? super AvatarStatusVideos> htJ) {
                return invoke(avatarMedia, AnonymousClass001.A1X(bool), htJ);
            }
        }

        /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$2$2, reason: invalid class name and collision with other inner class name */
        public final /* synthetic */ class C01872 implements C20Z, InterfaceC2349BUy {
            public final /* synthetic */ HatchIdentityProvider $tmp0;

            public C01872(HatchIdentityProvider hatchIdentityProvider) {
                this.$tmp0 = hatchIdentityProvider;
            }

            public final Object emit(AvatarStatusVideos avatarStatusVideos, HtJ<? super Unit> htJ) {
                this.$tmp0.prefetchStatusVideos(avatarStatusVideos);
                return Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                    return C3cI.A1V(obj, getFunctionDelegate());
                }
                return false;
            }

            @Override // X.InterfaceC2349BUy
            public final Ht9<?> getFunctionDelegate() {
                return new F2X(2, this.$tmp0, HatchIdentityProvider.class, "prefetchStatusVideos", "prefetchStatusVideos(Lcom/facebook/aura/model/AvatarStatusVideos;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                this.$tmp0.prefetchStatusVideos((AvatarStatusVideos) obj);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchIdentityProvider.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C60I c60iA03 = C3rb.A03(new AnonymousClass1(HatchIdentityProvider.this, null), HatchIdentityProvider.this.avatarMedia, HatchAvatarAppearance.INSTANCE.isDarkFlow());
                C01872 c01872 = new C01872(HatchIdentityProvider.this);
                this.label = 1;
                if (c60iA03.collect(c01872, this) == enumC10460Hji) {
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
            return HatchIdentityProvider.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$3", f = "HatchIdentityProvider.kt", l = {177}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$3$2, reason: invalid class name */
        public final class AnonymousClass2<T> implements C20Z {
            public final /* synthetic */ F1F $hasObservedAvatarImage;
            public final /* synthetic */ HatchIdentityProvider this$0;

            public AnonymousClass2(F1F f1f, HatchIdentityProvider hatchIdentityProvider) {
                this.$hasObservedAvatarImage = f1f;
                this.this$0 = hatchIdentityProvider;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((String) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.String r6, X.HtJ<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.facebook.aura.identity.provider.HatchIdentityProvider$3$2$emit$1
                    if (r0 == 0) goto L3e
                    r4 = r7
                    com.facebook.aura.identity.provider.HatchIdentityProvider$3$2$emit$1 r4 = (com.facebook.aura.identity.provider.HatchIdentityProvider$3$2$emit$1) r4
                    int r2 = r4.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L3e
                    int r2 = r2 - r1
                    r4.label = r2
                L12:
                    java.lang.Object r1 = r4.result
                    X.Hji r3 = X.EnumC10460Hji.A02
                    int r0 = r4.label
                    r2 = 1
                    if (r0 == 0) goto L27
                    if (r0 != r2) goto L44
                    X.Hwg.A00(r1)
                L20:
                    X.F1F r0 = r5.$hasObservedAvatarImage
                    r0.element = r2
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L27:
                    X.Hwg.A00(r1)
                    X.F1F r0 = r5.$hasObservedAvatarImage
                    boolean r0 = r0.element
                    if (r0 == 0) goto L20
                    com.facebook.aura.identity.provider.HatchIdentityProvider r1 = r5.this$0
                    r0 = 0
                    r4.L$0 = r0
                    r4.label = r2
                    java.lang.Object r0 = r1.fetchChatThemesIfNeeded(r2, r4)
                    if (r0 != r3) goto L20
                    return r3
                L3e:
                    com.facebook.aura.identity.provider.HatchIdentityProvider$3$2$emit$1 r4 = new com.facebook.aura.identity.provider.HatchIdentityProvider$3$2$emit$1
                    r4.<init>(r5, r7)
                    goto L12
                L44:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.identity.provider.HatchIdentityProvider.AnonymousClass3.AnonymousClass2.emit(java.lang.String, X.HtJ):java.lang.Object");
            }
        }

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchIdentityProvider.this.new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                F1F f1f = new F1F();
                HatchIdentityProvider hatchIdentityProvider = HatchIdentityProvider.this;
                C20Q c20qA01 = GDB.A01(new HatchIdentityProvider$3$invokeSuspend$$inlined$map$1(hatchIdentityProvider.aiIdentity));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(f1f, hatchIdentityProvider);
                this.L$0 = null;
                this.label = 1;
                if (c20qA01.collect(anonymousClass2, this) == enumC10460Hji) {
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
            return HatchIdentityProvider.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$4", f = "HatchIdentityProvider.kt", l = {187}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchIdentityProvider.this.new AnonymousClass4(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<ThemeUpdateEvent> themeUpdateEvents = HatchIdentityProvider.this.gateway.getThemeUpdateEvents();
                final HatchIdentityProvider hatchIdentityProvider = HatchIdentityProvider.this;
                C20Z<? super ThemeUpdateEvent> c20z = new C20Z() { // from class: com.facebook.aura.identity.provider.HatchIdentityProvider.4.1
                    public final Object emit(ThemeUpdateEvent themeUpdateEvent, HtJ<? super Unit> htJ) {
                        hatchIdentityProvider.applyThemeUpdateFromServer(themeUpdateEvent.selectedThemeId);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ThemeUpdateEvent) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (themeUpdateEvents.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchIdentityProvider.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$clearUserData$1", f = "HatchIdentityProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$clearUserData$1, reason: invalid class name and case insensitive filesystem */
    public final class C122361 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122361(HtJ<? super C122361> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchIdentityProvider.this.new C122361(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Context context;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                context = AuraAppContext.INSTANCE.getContext();
            } catch (Exception unused) {
            }
            if (context == null) {
                return Unit.INSTANCE;
            }
            synchronized (HatchIdentityProvider.this.stillFilesLock) {
                File[] fileArrListFiles = C3cG.A0O(context.getFilesDir(), HatchGatewayPrefsStore.AVATAR_DIR).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchIdentityProvider.this.new C122361(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider", f = "HatchIdentityProvider.kt", l = {422, 428}, m = "downloadAndCacheAvatar", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$1, reason: invalid class name and case insensitive filesystem */
    public final class C122371 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C122371(HtJ<? super C122371> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchIdentityProvider.this.downloadAndCacheAvatar(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$2", f = "HatchIdentityProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$2, reason: invalid class name and case insensitive filesystem */
    public final class C122382 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ File $targetFile;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122382(File file, HtJ<? super C122382> htJ) {
            super(2, htJ);
            this.$targetFile = file;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C122382(this.$targetFile, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(HatchIdentityProviderKt.isDecodableImage(this.$targetFile));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new C122382(this.$targetFile, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$3", f = "HatchIdentityProvider.kt", l = {MC.mwa_qpl_metadata.__CONFIG__, 439, 447, 464}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$3, reason: invalid class name and case insensitive filesystem */
    public final class C122393 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $avatarImageUrl;
        public final /* synthetic */ File $dir;
        public final /* synthetic */ Set<String> $keep;
        public final /* synthetic */ File $targetFile;
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
        public final /* synthetic */ HatchIdentityProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122393(String str, HatchIdentityProvider hatchIdentityProvider, File file, File file2, Set<String> set, HtJ<? super C122393> htJ) {
            super(2, htJ);
            this.$avatarImageUrl = str;
            this.this$0 = hatchIdentityProvider;
            this.$dir = file;
            this.$targetFile = file2;
            this.$keep = set;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C122393(this.$avatarImageUrl, this.this$0, this.$dir, this.$targetFile, this.$keep, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:80:0x01d3, code lost:
        
            if (X.C7Bq.A01(1500, r31) == r7) goto L81;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f4 A[Catch: all -> 0x01a9, TryCatch #4 {all -> 0x01a9, blocks: (B:26:0x00ec, B:29:0x00f4), top: B:100:0x00ec }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x012a A[Catch: Exception -> 0x01b1, CancellationException -> 0x01f4, TRY_ENTER, TryCatch #6 {CancellationException -> 0x01f4, blocks: (B:15:0x0041, B:25:0x00e9, B:35:0x012a, B:37:0x012f, B:41:0x015b, B:43:0x0161, B:44:0x0163, B:48:0x016c, B:63:0x019e, B:64:0x019f, B:67:0x01a5, B:68:0x01a6, B:74:0x01ac, B:75:0x01af, B:40:0x0158, B:24:0x00e6), top: B:104:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x012f A[Catch: Exception -> 0x01b1, CancellationException -> 0x01f4, TryCatch #6 {CancellationException -> 0x01f4, blocks: (B:15:0x0041, B:25:0x00e9, B:35:0x012a, B:37:0x012f, B:41:0x015b, B:43:0x0161, B:44:0x0163, B:48:0x016c, B:63:0x019e, B:64:0x019f, B:67:0x01a5, B:68:0x01a6, B:74:0x01ac, B:75:0x01af, B:40:0x0158, B:24:0x00e6), top: B:104:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0161 A[Catch: Exception -> 0x01b1, CancellationException -> 0x01f4, TryCatch #6 {CancellationException -> 0x01f4, blocks: (B:15:0x0041, B:25:0x00e9, B:35:0x012a, B:37:0x012f, B:41:0x015b, B:43:0x0161, B:44:0x0163, B:48:0x016c, B:63:0x019e, B:64:0x019f, B:67:0x01a5, B:68:0x01a6, B:74:0x01ac, B:75:0x01af, B:40:0x0158, B:24:0x00e6), top: B:104:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v3, types: [com.facebook.aura.identity.provider.HatchIdentityProvider] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01b3 -> B:13:0x003d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01d3 -> B:13:0x003d). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 502
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.identity.provider.HatchIdentityProvider.C122393.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C122393) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$ensureChatThemesFetched$1", f = "HatchIdentityProvider.kt", l = {263}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$ensureChatThemesFetched$1, reason: invalid class name and case insensitive filesystem */
    public final class C122401 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122401(HtJ<? super C122401> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchIdentityProvider.this.new C122401(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchIdentityProvider hatchIdentityProvider = HatchIdentityProvider.this;
                this.label = 1;
                if (hatchIdentityProvider.fetchChatThemesIfNeeded(false, this) == enumC10460Hji) {
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
            return HatchIdentityProvider.this.new C122401(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider", f = "HatchIdentityProvider.kt", l = {638, 278, 648, 648}, m = "fetchChatThemesIfNeeded", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$fetchChatThemesIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    public final class C122411 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C122411(HtJ<? super C122411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchIdentityProvider.this.fetchChatThemesIfNeeded(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider", f = "HatchIdentityProvider.kt", l = {291, 648}, m = "fetchChatThemesInternal", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$fetchChatThemesInternal$1, reason: invalid class name and case insensitive filesystem */
    public final class C122421 extends HzP {
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
        public /* synthetic */ Object result;

        public C122421(HtJ<? super C122421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchIdentityProvider.this.fetchChatThemesInternal(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$prefetchAvatar$1", f = "HatchIdentityProvider.kt", l = {399}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$prefetchAvatar$1, reason: invalid class name and case insensitive filesystem */
    public final class C122431 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $avatarImageUrl;
        public final /* synthetic */ String $fileName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122431(String str, String str2, HtJ<? super C122431> htJ) {
            super(2, htJ);
            this.$avatarImageUrl = str;
            this.$fileName = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchIdentityProvider.this.new C122431(this.$avatarImageUrl, this.$fileName, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchIdentityProvider hatchIdentityProvider = HatchIdentityProvider.this;
                String str = this.$avatarImageUrl;
                String str2 = this.$fileName;
                LinkedHashSet linkedHashSetA02 = BGK.A02(this.$fileName, hatchIdentityProvider.currentStillFiles(hatchIdentityProvider.avatarMedia.getValue()));
                this.label = 1;
                if (hatchIdentityProvider.downloadAndCacheAvatar(str, str2, linkedHashSetA02, this) == enumC10460Hji) {
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
            return ((C122431) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$setChatTheme$1", f = "HatchIdentityProvider.kt", l = {244}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$setChatTheme$1, reason: invalid class name and case insensitive filesystem */
    public final class C122441 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $normalizedThemeId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122441(String str, HtJ<? super C122441> htJ) {
            super(2, htJ);
            this.$normalizedThemeId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchIdentityProvider.this.new C122441(this.$normalizedThemeId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchIdentityProvider hatchIdentityProvider = HatchIdentityProvider.this;
                String str = this.$normalizedThemeId;
                this.label = 1;
                if (hatchIdentityProvider.setChatThemeOnServer(str, this) == enumC10460Hji) {
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
            return ((C122441) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider", f = "HatchIdentityProvider.kt", l = {672}, m = "setChatThemeOnServer", v = 2)
    /* renamed from: com.facebook.aura.identity.provider.HatchIdentityProvider$setChatThemeOnServer$1, reason: invalid class name and case insensitive filesystem */
    public final class C122451 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C122451(HtJ<? super C122451> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchIdentityProvider.this.setChatThemeOnServer(null, this);
        }
    }

    public HatchIdentityProvider(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.gateway = companion;
        this.gatewayPrefs = C3cG.A0D(abstractC3358CGz);
        HzC hzCA0x = C3cH.A0x(AnonymousClass001.A0y());
        this.scope = hzCA0x;
        C1BN<AiIdentity> aiIdentity = companion.getAiIdentity();
        this.aiIdentity = aiIdentity;
        this.statusVideoCache = new HatchStatusVideoCache(abstractC3358CGz);
        HatchIdentityProvider$special$$inlined$map$1 hatchIdentityProvider$special$$inlined$map$1 = new HatchIdentityProvider$special$$inlined$map$1(aiIdentity, this);
        C3Ej c3Ej = C3Ek.A00;
        C3Pi c3PiA00 = AnonymousClass441.A00(displayAvatarMedia(aiIdentity.getValue()), hzCA0x, hatchIdentityProvider$special$$inlined$map$1, c3Ej);
        this.avatarMedia = c3PiA00;
        this.aiIdentityName = AnonymousClass441.A00(HatchIdentityProviderKt.displayName(aiIdentity.getValue()), hzCA0x, new HatchIdentityProvider$special$$inlined$map$2(aiIdentity), c3Ej);
        C9286GCn c9286GCnA01 = HnJ.A01(restoreCachedStills());
        this.cachedStills = c9286GCnA01;
        this.stillFilesLock = C3cG.A0T();
        HatchAvatarAppearance hatchAvatarAppearance = HatchAvatarAppearance.INSTANCE;
        this.cachedAvatarUri = AnonymousClass441.A00(cachedStillFor((Map) c9286GCnA01.getValue(), (AvatarMedia) c3PiA00.getValue(), hatchAvatarAppearance.isDark()), hzCA0x, C3rb.A00(new HatchIdentityProvider$cachedAvatarUri$1(this), c9286GCnA01, c3PiA00, hatchAvatarAppearance.isDarkFlow()), c3Ej);
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchChatThemesState(C0881AGi.A00, loadStoredThemeId(), false, false));
        this._chatThemes = c9286GCnA14;
        this.chatThemes = C3cG.A11(c9286GCnA14);
        this.conversationTheme = AnonymousClass441.A00(HatchConversationTheme.DEFAULT, hzCA0x, new HatchIdentityProvider$special$$inlined$map$3(c9286GCnA14), c3Ej);
        this.chatThemesFetchMutex = new C9258GBl();
        loadCachedChatThemes();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass2(null), hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass3(null), hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass4(null), hzCA0x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Set<String> currentStillFiles(AvatarMedia avatarMedia) {
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(AbstractC0878AGe.A0a(stillCandidates(avatarMedia, false), 1), AbstractC0878AGe.A0a(stillCandidates(avatarMedia, true), 1));
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0P);
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            HxE hxE = (HxE) it.next();
            arrayListA0i.add(HatchIdentityProviderKt.stillFileName((String) hxE.first, ((Boolean) hxE.second).booleanValue()));
        }
        return AbstractC0878AGe.A0g(arrayListA0i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadAndCacheAvatar(java.lang.String r9, java.lang.String r10, java.util.Set<java.lang.String> r11, X.HtJ<? super java.lang.Boolean> r12) {
        /*
            r8 = this;
            r7 = r9
            r3 = r12
            boolean r0 = r12 instanceof com.facebook.aura.identity.provider.HatchIdentityProvider.C122371
            if (r0 == 0) goto La3
            r4 = r3
            com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$1 r4 = (com.facebook.aura.identity.provider.HatchIdentityProvider.C122371) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L26
            if (r0 == r6) goto L64
            if (r0 != r2) goto Laa
            X.Hwg.A00(r1)
        L25:
            return r1
        L26:
            X.Hwg.A00(r1)
            com.facebook.aura.common.appcontext.AuraAppContext r0 = com.facebook.aura.common.appcontext.AuraAppContext.INSTANCE
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto L37
            r0 = 0
        L32:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L37:
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "avatar_cache"
            java.io.File r9 = X.C3cG.A0O(r1, r0)
            java.io.File r10 = X.C3cG.A0O(r9, r10)
            X.78T r5 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$2 r0 = new com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$2
            r0.<init>(r10, r1)
            r4.L$0 = r7
            r4.L$1 = r1
            r4.L$2 = r11
            r4.L$3 = r1
            r4.L$4 = r9
            r4.L$5 = r10
            r4.label = r6
            java.lang.Object r1 = X.GAo.A00(r4, r5, r0)
            if (r1 != r3) goto L76
            return r3
        L64:
            java.lang.Object r10 = r4.L$5
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r9 = r4.L$4
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r11 = r4.L$2
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r0 = r4.L$0
            java.lang.String r7 = X.C3cG.A0d(r0, r1)
        L76:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 == 0) goto L81
            r8.publishStill(r10, r11)
            r0 = 1
            goto L32
        L81:
            r10.delete()
            X.78T r0 = X.AnonymousClass001.A0y()
            r12 = 0
            com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$3 r6 = new com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4.L$0 = r12
            r4.L$1 = r12
            r4.L$2 = r12
            r4.L$3 = r12
            r4.L$4 = r12
            r4.L$5 = r12
            r4.label = r2
            java.lang.Object r1 = X.GAo.A00(r4, r0, r6)
            if (r1 != r3) goto L25
            return r3
        La3:
            com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$1 r4 = new com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$1
            r4.<init>(r12)
            goto L14
        Laa:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.identity.provider.HatchIdentityProvider.downloadAndCacheAvatar(java.lang.String, java.lang.String, java.util.Set, X.HtJ):java.lang.Object");
    }

    public final void applyLocalAiIdentityName(String str) {
        C7384Etj.A0Y(str, 0);
        this.gateway.applyLocalAiIdentityName(str);
    }

    public final void applyThemeFromUiControl(String str) {
        C7384Etj.A0Y(str, 0);
        String strNormalizedChatThemeId = HatchChatThemeHelperKt.normalizedChatThemeId(str);
        if (strNormalizedChatThemeId == null) {
            strNormalizedChatThemeId = "default";
        }
        if (strNormalizedChatThemeId.equals(C3cG.A0E(this).selectedThemeId)) {
            return;
        }
        BLG<HatchChatThemesState> blg = this._chatThemes;
        HatchChatThemesState value = blg.getValue();
        List<HatchChatThemeOption> list = value.themes;
        boolean z = value.hasFetched;
        boolean z2 = value.isFetching;
        C7384Etj.A0Y(list, 0);
        C9286GCn.A00(null, new HatchChatThemesState(list, strNormalizedChatThemeId, z, z2), (C9286GCn) blg);
        persistSelectedChatThemeId(strNormalizedChatThemeId);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.userDataCleared = true;
        this.cachedStills.Af8(AGH.A0E());
        AnonymousClass001.A1E(this._chatThemes, null, new HatchChatThemesState(C0881AGi.A00, "default", false, false));
        BzK bzKA9q = HatchPrefsStore.INSTANCE.userPrefs(this.userSession).A9q();
        bzKA9q.Aae(scopedVmPrefKey(HatchGatewayPrefsStore.PREF_CHAT_COLOR_SCHEME));
        bzKA9q.Aae(scopedVmPrefKey(HatchGatewayPrefsStore.PREF_CHAT_THEMES_CACHE));
        bzKA9q.Aae(HatchGatewayPrefsStore.PREF_CHAT_COLOR_SCHEME);
        bzKA9q.Aae(HatchGatewayPrefsStore.PREF_CHAT_THEMES_CACHE);
        bzKA9q.apply();
        HzS.A04(this.scope.AEA());
        AnonymousClass001.A1J(new C122361(null), this.scope);
    }

    public final void prefetchAvatar(String str) {
        C7384Etj.A0Y(str, 0);
        String strAvatarCacheFileName = HatchIdentityProviderKt.avatarCacheFileName(str);
        AnonymousClass001.A1J(new C122431(str, strAvatarCacheFileName, null), this.scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri rememberCurrentAvatarImageUri(boolean z, BFM bfm, int i, int i2) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = HatchAvatarAppearanceKt.isAvatarDark(bfm, 0);
        }
        C1BO c1boA02 = C2CK.A02(bfm, this.cachedStills);
        C1BO c1boA022 = C2CK.A02(bfm, this.avatarMedia);
        boolean zA1K = AnonymousClass003.A1K(bfm, c1boA02.getValue(), ((AvatarMedia) c1boA022.getValue()).still);
        if ((((i & 14) ^ 6) <= 4 || !bfm.A66(z)) && (i & 6) != 4) {
            z2 = false;
        }
        boolean z3 = zA1K | z2;
        Uri uriAaT = bfm.AaT();
        if (z3 || uriAaT == C78N.A00) {
            HxE hxE = (HxE) AbstractC0878AGe.A0G(stillCandidates((AvatarMedia) c1boA022.getValue(), z));
            Map<String, ? extends Uri> map = (Map) c1boA02.getValue();
            if (hxE == null) {
                uriAaT = cachedStillFor(map, (AvatarMedia) c1boA022.getValue(), z);
            } else {
                uriAaT = map.get(HatchIdentityProviderKt.stillFileName((String) hxE.first, AnonymousClass001.A1X(hxE.second)));
                if (uriAaT == null) {
                    uriAaT = Uri.parse((String) hxE.first);
                }
            }
            bfm.Ai0(uriAaT);
        }
        return (Uri) uriAaT;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[PHI: r4
  0x007a: PHI (r4v1 android.net.Uri) = (r4v0 android.net.Uri), (r4v3 android.net.Uri) binds: [B:39:0x0077, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.vds.compose.common.AuraDrawableSource rememberDefaultAvatarSource(android.net.Uri r6, X.BFM r7, int r8, int r9) {
        /*
            r5 = this;
            r3 = 1
            r1 = r9 & 1
            r0 = 0
            if (r1 == 0) goto L7
            r6 = r0
        L7:
            r2 = r8 & 112(0x70, float:1.57E-43)
            r1 = 0
            android.net.Uri r5 = r5.rememberCurrentAvatarImageUri(r1, r7, r2, r3)
            if (r6 == 0) goto L76
            android.net.Uri$Builder r1 = r6.buildUpon()
            if (r1 == 0) goto L76
            android.net.Uri$Builder r1 = r1.clearQuery()
            if (r1 == 0) goto L76
            android.net.Uri r4 = r1.build()
        L20:
            java.lang.String r2 = r6.getPath()
            if (r2 == 0) goto L7a
            r1 = 47
            java.lang.String r2 = X.C7BY.A0R(r2, r2, r1)
        L2c:
            if (r5 == 0) goto L3a
            java.lang.String r1 = r5.getPath()
            if (r1 == 0) goto L3a
            r0 = 47
            java.lang.String r0 = X.C7BY.A0R(r1, r1, r0)
        L3a:
            if (r2 == 0) goto L74
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L74
        L42:
            boolean r0 = X.AnonymousClass003.A1K(r7, r4, r5)
            java.lang.Object r1 = r7.AaT()
            if (r0 != 0) goto L50
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L60
        L50:
            if (r5 == 0) goto L63
            if (r6 == 0) goto L56
            if (r3 == 0) goto L6e
        L56:
            com.facebook.aura.vds.compose.common.AuraDrawableSourceUri r1 = new com.facebook.aura.vds.compose.common.AuraDrawableSourceUri
            r1.<init>(r5)
        L5b:
            com.facebook.aura.vds.compose.common.AuraDrawableSource r1 = (com.facebook.aura.vds.compose.common.AuraDrawableSource) r1
        L5d:
            r7.Ai0(r1)
        L60:
            com.facebook.aura.vds.compose.common.AuraDrawableSource r1 = (com.facebook.aura.vds.compose.common.AuraDrawableSource) r1
            return r1
        L63:
            if (r6 != 0) goto L6e
            r0 = 2131230885(0x7f0800a5, float:1.8077835E38)
            com.facebook.aura.vds.compose.common.AuraDrawableSourceResource r1 = new com.facebook.aura.vds.compose.common.AuraDrawableSourceResource
            r1.<init>(r0)
            goto L5b
        L6e:
            com.facebook.aura.vds.compose.common.AuraDrawableSourceUri r1 = new com.facebook.aura.vds.compose.common.AuraDrawableSourceUri
            r1.<init>(r6)
            goto L5d
        L74:
            r3 = 0
            goto L42
        L76:
            r4 = r0
            if (r6 == 0) goto L7a
            goto L20
        L7a:
            r2 = r0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.identity.provider.HatchIdentityProvider.rememberDefaultAvatarSource(android.net.Uri, X.BFM, int, int):com.facebook.aura.vds.compose.common.AuraDrawableSource");
    }

    public final void setChatTheme(String str) {
        C7384Etj.A0Y(str, 0);
        String strNormalizedChatThemeId = HatchChatThemeHelperKt.normalizedChatThemeId(str);
        if (strNormalizedChatThemeId == null) {
            strNormalizedChatThemeId = "default";
        }
        BLG<HatchChatThemesState> blg = this._chatThemes;
        HatchChatThemesState value = blg.getValue();
        List<HatchChatThemeOption> list = value.themes;
        boolean z = value.hasFetched;
        boolean z2 = value.isFetching;
        C7384Etj.A0Y(list, 0);
        C9286GCn.A00(null, new HatchChatThemesState(list, strNormalizedChatThemeId, z, z2), (C9286GCn) blg);
        persistSelectedChatThemeId(strNormalizedChatThemeId);
        AnonymousClass001.A1J(new C122441(strNormalizedChatThemeId, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AvatarMedia displayAvatarMedia(AiIdentity aiIdentity) {
        AvatarMedia avatarMedia;
        return (aiIdentity == null || (avatarMedia = aiIdentity.avatarMedia) == null) ? new AvatarMedia(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0) : !avatarMedia.videos.containsKey(AvatarVideoVariant.IDLE) ? avatarMedia.copy(avatarMedia.still, AGH.A02(this.statusVideoCache.loadPaths(), avatarMedia.videos), avatarMedia.startFrames, avatarMedia.callIdle, avatarMedia.callIdleCrop, avatarMedia.callIdleDarkCrop, avatarMedia.revision) : avatarMedia;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x00ef, Exception -> 0x0101, TryCatch #2 {Exception -> 0x0101, all -> 0x00ef, blocks: (B:28:0x0093, B:29:0x0097, B:31:0x009d, B:33:0x00ab, B:35:0x00af, B:36:0x00b5, B:17:0x003f, B:18:0x0042, B:20:0x0048, B:25:0x0056, B:14:0x0032), top: B:52:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchChatThemesInternal(X.HtJ<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.identity.provider.HatchIdentityProvider.fetchChatThemesInternal(X.HtJ):java.lang.Object");
    }

    private final void loadCachedChatThemes() {
        HatchChatThemesPayload chatThemesResponse;
        String strA00 = C4oT.A00(HatchPrefsStore.INSTANCE.userPrefs(this.userSession), scopedVmPrefKey(HatchGatewayPrefsStore.PREF_CHAT_THEMES_CACHE));
        if (strA00 == null || (chatThemesResponse = HatchChatThemeJsonKt.parseChatThemesResponse(strA00)) == null) {
            return;
        }
        BLG<HatchChatThemesState> blg = this._chatThemes;
        HatchChatThemesState value = blg.getValue();
        List<HatchChatThemeOption> list = chatThemesResponse.themes;
        String str = value.selectedThemeId;
        AnonymousClass003.A0u(list, str);
        C9286GCn.A00(null, new HatchChatThemesState(list, str, false, false), (C9286GCn) blg);
    }

    private final String loadStoredThemeId() {
        String strNormalizedChatThemeId = HatchChatThemeHelperKt.normalizedChatThemeId(C4oT.A00(HatchPrefsStore.INSTANCE.userPrefs(this.userSession), scopedVmPrefKey(HatchGatewayPrefsStore.PREF_CHAT_COLOR_SCHEME)));
        return strNormalizedChatThemeId == null ? "default" : strNormalizedChatThemeId;
    }

    private final void persistSelectedChatThemeId(String str) {
        BzK bzKA9q = HatchPrefsStore.INSTANCE.userPrefs(this.userSession).A9q();
        bzKA9q.AYr(scopedVmPrefKey(HatchGatewayPrefsStore.PREF_CHAT_COLOR_SCHEME), str);
        bzKA9q.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prefetchStatusVideos(AvatarStatusVideos avatarStatusVideos) {
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context != null) {
            HatchVideoPrefetcher companion = HatchVideoPrefetcher.Companion.getInstance();
            List listA0F = BFI.A0F(new String[]{avatarStatusVideos.idle, avatarStatusVideos.working, avatarStatusVideos.makingSomething, avatarStatusVideos.connecting, avatarStatusVideos.wakingVideo});
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : listA0F) {
                if (!C7BY.A0j((String) obj)) {
                    arrayListA0h.add(obj);
                }
            }
            for (String str : C3cG.A0m(arrayListA0h)) {
                companion.prefetchVideoByUri(context, str, str, null, 1048576, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishStill(File file, Set<String> set) {
        Map<String, Uri> value;
        LinkedHashMap linkedHashMap;
        if (this.userDataCleared) {
            return;
        }
        BLG<Map<String, Uri>> blg = this.cachedStills;
        do {
            value = blg.getValue();
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Uri> entry : value.entrySet()) {
                if (set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } while (!blg.A6e(value, AGH.A0C(linkedHashMap, new HxE(file.getName(), Uri.fromFile(file)))));
    }

    private final Map<String, Uri> restoreCachedStills() {
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context == null) {
            return AGH.A0E();
        }
        File[] fileArrListFiles = C3cG.A0O(context.getFilesDir(), HatchGatewayPrefsStore.AVATAR_DIR).listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList<File> arrayListA0h = C3cG.A0h();
        for (File file : fileArrListFiles) {
            C7384Etj.A0X(file);
            if (HatchIdentityProviderKt.isDecodableImage(file)) {
                arrayListA0h.add(file);
            } else {
                file.delete();
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(arrayListA0h));
        for (File file2 : arrayListA0h) {
            linkedHashMap.put(file2.getName(), Uri.fromFile(file2));
        }
        return linkedHashMap;
    }

    private final String scopedVmPrefKey(String str) {
        String strA0a = C3cG.A0a(this.gatewayPrefs);
        if (strA0a == null) {
            strA0a = this.gatewayPrefs.getGatewayUrl();
            if (C7BY.A0j(strA0a) || strA0a == null) {
                strA0a = "default";
            }
        }
        return FGI.A0U(str, ":", strA0a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setChatThemeOnServer(java.lang.String r26, X.HtJ<? super kotlin.Unit> r27) {
        /*
            r25 = this;
            r2 = r26
            r6 = r27
            boolean r0 = r6 instanceof com.facebook.aura.identity.provider.HatchIdentityProvider.C122451
            r3 = r25
            if (r0 == 0) goto L28
            r1 = r6
            com.facebook.aura.identity.provider.HatchIdentityProvider$setChatThemeOnServer$1 r1 = (com.facebook.aura.identity.provider.HatchIdentityProvider.C122451) r1
            int r5 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r4
            if (r0 == 0) goto L28
            int r5 = r5 - r4
            r1.label = r5
        L18:
            java.lang.Object r6 = r1.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r5 = r1.label
            r0 = 1
            if (r5 == 0) goto L33
            if (r5 != r0) goto L2e
            java.lang.Object r2 = r1.L$0
            java.lang.String r2 = (java.lang.String) r2
            goto L91
        L28:
            com.facebook.aura.identity.provider.HatchIdentityProvider$setChatThemeOnServer$1 r1 = new com.facebook.aura.identity.provider.HatchIdentityProvider$setChatThemeOnServer$1
            r1.<init>(r6)
            goto L18
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r6)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> Ld1
            com.facebook.aura.network.api.JarvisPath$ChatThemesSet r9 = com.facebook.aura.network.api.JarvisPath.ChatThemesSet.INSTANCE     // Catch: java.lang.Exception -> Ld1
            com.facebook.aura.identity.provider.HatchChatThemesSetRequestJson r10 = new com.facebook.aura.identity.provider.HatchChatThemesSetRequestJson     // Catch: java.lang.Exception -> Ld1
            r10.<init>(r2)     // Catch: java.lang.Exception -> Ld1
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST     // Catch: java.lang.Exception -> Ld1
            X.CGz r12 = r3.userSession     // Catch: java.lang.Exception -> Ld1
            r8 = 0
            X.HxE[] r15 = new X.HxE[r8]     // Catch: java.lang.Exception -> Ld1
            java.util.Set r16 = X.AnonymousClass004.A18()     // Catch: java.lang.Exception -> Ld1
            X.9jH r19 = X.AGH.A0E()     // Catch: java.lang.Exception -> Ld1
            com.facebook.aura.identity.provider.HatchIdentityProvider$setChatThemeOnServer$$inlined$executeJarvisRequest-Z6QaZII$default$1 r6 = com.facebook.aura.identity.provider.HatchIdentityProvider$setChatThemeOnServer$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE     // Catch: java.lang.Exception -> Ld1
            com.facebook.aura.identity.provider.HatchIdentityProvider$setChatThemeOnServer$$inlined$executeJarvisRequest-Z6QaZII$default$2 r7 = com.facebook.aura.identity.provider.HatchIdentityProvider$setChatThemeOnServer$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE     // Catch: java.lang.Exception -> Ld1
            r1.L$0 = r2     // Catch: java.lang.Exception -> Ld1
            r13 = 0
            r1.L$1 = r13     // Catch: java.lang.Exception -> Ld1
            r1.L$2 = r13     // Catch: java.lang.Exception -> Ld1
            r1.L$3 = r13     // Catch: java.lang.Exception -> Ld1
            r1.L$4 = r13     // Catch: java.lang.Exception -> Ld1
            r1.L$5 = r13     // Catch: java.lang.Exception -> Ld1
            r1.L$6 = r13     // Catch: java.lang.Exception -> Ld1
            r1.L$7 = r13     // Catch: java.lang.Exception -> Ld1
            r1.L$8 = r13     // Catch: java.lang.Exception -> Ld1
            r1.I$0 = r0     // Catch: java.lang.Exception -> Ld1
            r1.I$1 = r0     // Catch: java.lang.Exception -> Ld1
            r1.I$2 = r8     // Catch: java.lang.Exception -> Ld1
            r1.I$3 = r0     // Catch: java.lang.Exception -> Ld1
            r1.I$4 = r8     // Catch: java.lang.Exception -> Ld1
            r1.I$5 = r8     // Catch: java.lang.Exception -> Ld1
            r1.I$6 = r8     // Catch: java.lang.Exception -> Ld1
            r1.label = r0     // Catch: java.lang.Exception -> Ld1
            r14 = r13
            r18 = r0
            r20 = r13
            r21 = r8
            r22 = r0
            r23 = r8
            r24 = r8
            r25 = r13
            r26 = r8
            r27 = r1
            r17 = r0
            java.lang.Object r1 = r5.m1599executeJarvisRequestWithFof5HsY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Exception -> Ld1
            if (r1 != r4) goto L95
            return r4
        L91:
            java.lang.Object r1 = X.AnonymousClass001.A0q(r6)     // Catch: java.lang.Exception -> Ld1
        L95:
            java.lang.Throwable r0 = X.HsJ.A00(r1)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto Ld1
            com.facebook.aura.identity.provider.HatchChatThemesSetResponseJson r1 = (com.facebook.aura.identity.provider.HatchChatThemesSetResponseJson) r1     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = r1.selected_theme_id     // Catch: java.lang.Exception -> Ld1
            java.lang.String r6 = com.facebook.aura.identity.provider.HatchChatThemeHelperKt.normalizedChatThemeId(r0)     // Catch: java.lang.Exception -> Ld1
            if (r6 != 0) goto La6
            r6 = r2
        La6:
            com.facebook.aura.identity.provider.HatchChatThemesState r0 = X.C3cG.A0E(r3)     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = r0.selectedThemeId     // Catch: java.lang.Exception -> Ld1
            boolean r0 = X.C7384Etj.areEqual(r6, r0)     // Catch: java.lang.Exception -> Ld1
            if (r0 != 0) goto Lce
            X.BLG<com.facebook.aura.identity.provider.HatchChatThemesState> r5 = r3._chatThemes     // Catch: java.lang.Exception -> Ld1
            java.lang.Object r0 = r5.getValue()     // Catch: java.lang.Exception -> Ld1
            com.facebook.aura.identity.provider.HatchChatThemesState r0 = (com.facebook.aura.identity.provider.HatchChatThemesState) r0     // Catch: java.lang.Exception -> Ld1
            java.util.List<com.facebook.aura.identity.provider.HatchChatThemeOption> r4 = r0.themes     // Catch: java.lang.Exception -> Ld1
            boolean r2 = r0.hasFetched     // Catch: java.lang.Exception -> Ld1
            boolean r0 = r0.isFetching     // Catch: java.lang.Exception -> Ld1
            X.AnonymousClass003.A0u(r4, r6)     // Catch: java.lang.Exception -> Ld1
            com.facebook.aura.identity.provider.HatchChatThemesState r1 = new com.facebook.aura.identity.provider.HatchChatThemesState     // Catch: java.lang.Exception -> Ld1
            r1.<init>(r4, r6, r2, r0)     // Catch: java.lang.Exception -> Ld1
            X.GCn r5 = (X.C9286GCn) r5     // Catch: java.lang.Exception -> Ld1
            r0 = 0
            X.C9286GCn.A00(r0, r1, r5)     // Catch: java.lang.Exception -> Ld1
        Lce:
            r3.persistSelectedChatThemeId(r6)     // Catch: java.lang.Exception -> Ld1
        Ld1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.identity.provider.HatchIdentityProvider.setChatThemeOnServer(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void ensureChatThemesFetched() {
        AnonymousClass001.A1J(new C122401(null), this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3 A[Catch: all -> 0x00cb, TryCatch #4 {all -> 0x00cb, blocks: (B:47:0x00bb, B:49:0x00c3, B:50:0x00c5), top: B:79:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #1 {all -> 0x00f2, blocks: (B:60:0x00e4, B:62:0x00ec), top: B:73:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchChatThemesIfNeeded(boolean r11, X.HtJ<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.identity.provider.HatchIdentityProvider.fetchChatThemesIfNeeded(boolean, X.HtJ):java.lang.Object");
    }

    public final C1BN<AiIdentity> getAiIdentity() {
        return this.aiIdentity;
    }

    public final C1BN<String> getAiIdentityName() {
        return this.aiIdentityName;
    }

    public final C1BN<AvatarMedia> getAvatarMedia() {
        return this.avatarMedia;
    }

    public final C1BN<Uri> getCachedAvatarUri() {
        return this.cachedAvatarUri;
    }

    public final C1BN<HatchChatThemesState> getChatThemes() {
        return this.chatThemes;
    }

    public final C1BN<HatchConversationTheme> getConversationTheme() {
        return this.conversationTheme;
    }

    public final HatchIcon hatchIcon() {
        Uri uriCachedStillFor = cachedStillFor(this.cachedStills.getValue(), this.avatarMedia.getValue(), HatchAvatarAppearance.INSTANCE.isDark());
        return uriCachedStillFor != null ? new HatchIcon.LocalImage(uriCachedStillFor) : HatchIcon.Default.INSTANCE;
    }

    public final HatchIcon rememberHatchIcon(BFM bfm, int i) {
        C1BO c1boA02 = C2CK.A02(bfm, this.cachedAvatarUri);
        boolean zA65 = bfm.A65(c1boA02.getValue());
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            Uri uri = (Uri) c1boA02.getValue();
            objAaT = uri != null ? new HatchIcon.LocalImage(uri) : HatchIcon.Default.INSTANCE;
            bfm.Ai0(objAaT);
        }
        return (HatchIcon) objAaT;
    }

    public final class Companion {
        public final HatchIdentityProvider getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchIdentityProvider) abstractC3358CGz.A03(HatchIdentityProvider.class, new HatchIdentityProvider$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThemeUpdateFromServer(String str) {
        String strNormalizedChatThemeId = HatchChatThemeHelperKt.normalizedChatThemeId(str);
        if (strNormalizedChatThemeId == null || strNormalizedChatThemeId.equals(C3cG.A0E(this).selectedThemeId)) {
            return;
        }
        BLG<HatchChatThemesState> blg = this._chatThemes;
        HatchChatThemesState value = blg.getValue();
        List<HatchChatThemeOption> list = value.themes;
        boolean z = value.hasFetched;
        boolean z2 = value.isFetching;
        C7384Etj.A0Y(list, 0);
        C9286GCn.A00(null, new HatchChatThemesState(list, strNormalizedChatThemeId, z, z2), (C9286GCn) blg);
        persistSelectedChatThemeId(strNormalizedChatThemeId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri cachedStillFor(Map<String, ? extends Uri> map, AvatarMedia avatarMedia, boolean z) {
        Object next;
        for (HxE<String, Boolean> hxE : stillCandidates(avatarMedia, z)) {
            Uri uri = map.get(HatchIdentityProviderKt.stillFileName(hxE.first, hxE.second.booleanValue()));
            if (uri != null) {
                return uri;
            }
        }
        Iterator it = AbstractC0878AGe.A0c(map.entrySet(), new Comparator() { // from class: com.facebook.aura.identity.provider.HatchIdentityProvider$cachedStillFor$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C3cG.A0P(AnonymousClass005.A1a((String) ((Map.Entry) t).getKey(), HatchIdentityProviderKt.DARK_STILL_PREFIX)).compareTo(C3cG.A0P(AnonymousClass005.A1a((String) ((Map.Entry) t2).getKey(), HatchIdentityProviderKt.DARK_STILL_PREFIX)));
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            if (z) {
                break;
            }
            String str = (String) entry.getKey();
            C7384Etj.A0Y(str, 0);
            if (!str.startsWith(HatchIdentityProviderKt.DARK_STILL_PREFIX)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (Uri) entry2.getValue();
        }
        return null;
    }

    public static final Map<String, Uri> rememberCurrentAvatarImageUri$lambda$0(C1BO<? extends Map<String, ? extends Uri>> c1bo) {
        return (Map) c1bo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HxE<String, Boolean>> stillCandidates(AvatarMedia avatarMedia, boolean z) {
        List<String> list = AvatarMediaSelectionKt.select(avatarMedia, z).stills;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : list) {
            String strAvatarImageUrl = HatchAiIdentityHandler.Companion.avatarImageUrl(str, this.userSession);
            if (strAvatarImageUrl != null) {
                arrayListA0h.add(new HxE(strAvatarImageUrl, Boolean.valueOf(avatarMedia.still.dark.contains(str))));
            }
        }
        return arrayListA0h;
    }
}
