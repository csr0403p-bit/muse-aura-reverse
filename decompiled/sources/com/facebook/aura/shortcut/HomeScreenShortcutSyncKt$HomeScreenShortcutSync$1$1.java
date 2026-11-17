package com.facebook.aura.shortcut;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C10543Hqv;
import X.C10649I0t;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3rb;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.avatarassets.appearance.HatchAvatarAppearance;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMediaSelectionKt;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1", f = "HomeScreenShortcutSync.kt", l = {36, MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$1", f = "HomeScreenShortcutSync.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchGatewayConnection hatchGatewayConnection, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$gateway, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final C10543Hqv c10543Hqv = new C10543Hqv();
                C1BN<AiIdentity> aiIdentity = this.$gateway.getAiIdentity();
                C20Z<? super AiIdentity> c20z = new C20Z() { // from class: com.facebook.aura.shortcut.HomeScreenShortcutSyncKt.HomeScreenShortcutSync.1.1.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((AiIdentity) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
                    public final Object emit(AiIdentity aiIdentity2, HtJ<? super Unit> htJ) {
                        String str;
                        ?? r2;
                        if (aiIdentity2 != null && (str = aiIdentity2.name) != null && (r2 = (T) AnonymousClass002.A0l(str)) != 0 && r2.length() != 0) {
                            C10543Hqv<String> c10543Hqv2 = c10543Hqv;
                            String str2 = c10543Hqv2.element;
                            if (str2 == null) {
                                c10543Hqv2.element = r2;
                            } else if (!r2.equals(str2)) {
                                c10543Hqv2.element = r2;
                                HomeScreenShortcutPersonalization homeScreenShortcutPersonalization = HomeScreenShortcutPersonalization.INSTANCE;
                                if (homeScreenShortcutPersonalization.isPersonalized(r2)) {
                                    homeScreenShortcutPersonalization.onPersonalizedInSession();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (aiIdentity.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$gateway, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$2", f = "HomeScreenShortcutSync.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0W<AiIdentity, Uri, HtJ<? super HxE<? extends AiIdentity, ? extends Uri>>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(AiIdentity aiIdentity, Uri uri, HtJ<? super HxE<? extends AiIdentity, ? extends Uri>> htJ) {
            return invoke2(aiIdentity, uri, (HtJ<? super HxE<AiIdentity, ? extends Uri>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AiIdentity aiIdentity = (AiIdentity) this.L$0;
            Object obj2 = this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (aiIdentity == null || AvatarMediaSelectionKt.select(aiIdentity.avatarMedia, HatchAvatarAppearance.INSTANCE.isDark()).stills.isEmpty() || obj2 == null) {
                return null;
            }
            return new HxE(AiIdentity.copy$default(aiIdentity, AnonymousClass002.A0l(aiIdentity.name), null, null, null, null, null, null, null, null, 510, null), obj2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AiIdentity aiIdentity, Uri uri, HtJ<? super HxE<AiIdentity, ? extends Uri>> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = aiIdentity;
            anonymousClass2.L$1 = uri;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass4<T> implements C20Z {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        public AnonymousClass4(Context context, AbstractC3358CGz abstractC3358CGz) {
            this.$context = context;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            return emit((HxE<AiIdentity, ? extends Uri>) obj, (HtJ<? super Unit>) htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(X.HxE<com.facebook.aura.model.AiIdentity, ? extends android.net.Uri> r12, X.HtJ<? super kotlin.Unit> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4$emit$1
                if (r0 == 0) goto L6a
                r10 = r13
                com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4$emit$1 r10 = (com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4$emit$1) r10
                int r2 = r10.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L6a
                int r2 = r2 - r1
                r10.label = r2
            L12:
                java.lang.Object r1 = r10.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r3 = 2
                r4 = 1
                if (r0 == 0) goto L26
                if (r0 == r4) goto L44
                if (r0 != r3) goto L70
                X.Hwg.A00(r1)
            L23:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            L26:
                X.Hwg.A00(r1)
                A r6 = r12.first
                com.facebook.aura.model.AiIdentity r6 = (com.facebook.aura.model.AiIdentity) r6
                java.lang.String r0 = r6.name
                int r0 = r0.length()
                if (r0 == 0) goto L23
                com.facebook.aura.shortcut.HatchShortcutManager r1 = com.facebook.aura.shortcut.HatchShortcutManager.INSTANCE
                android.content.Context r0 = r11.$context
                r10.L$0 = r6
                r10.label = r4
                java.lang.Object r1 = r1.isIdentityShortcutPinned(r0, r10)
                if (r1 != r2) goto L4b
                return r2
            L44:
                java.lang.Object r6 = r10.L$0
                com.facebook.aura.model.AiIdentity r6 = (com.facebook.aura.model.AiIdentity) r6
                X.Hwg.A00(r1)
            L4b:
                boolean r0 = X.AnonymousClass001.A1X(r1)
                if (r0 == 0) goto L23
                boolean r0 = com.facebook.aura.shortcut.HomeScreenShortcutSyncKt.getAddToHomeShortcutEnabled()
                if (r0 == 0) goto L23
                com.facebook.aura.shortcut.HatchShortcutManager r4 = com.facebook.aura.shortcut.HatchShortcutManager.INSTANCE
                android.content.Context r5 = r11.$context
                X.CGz r7 = r11.$userSession
                r8 = 0
                r10.L$0 = r8
                r10.label = r3
                r9 = r8
                java.lang.Object r0 = r4.requestPinShortcut(r5, r6, r7, r8, r9, r10)
                if (r0 != r2) goto L23
                return r2
            L6a:
                com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4$emit$1 r10 = new com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4$emit$1
                r10.<init>(r11, r13)
                goto L12
            L70:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1.AnonymousClass4.emit(X.HxE, X.HtJ):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1(Context context, AbstractC3358CGz abstractC3358CGz, HtJ<? super HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1 homeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1 = new HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1(this.$context, this.$userSession, htJ);
        homeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1.L$0 = obj;
        return homeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchShortcutManager hatchShortcutManager = HatchShortcutManager.INSTANCE;
            Context context = this.$context;
            this.L$0 = c3ux;
            this.label = 1;
            obj = hatchShortcutManager.isRequestPinShortcutSupported(context, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
        }
        if (AnonymousClass001.A1X(obj)) {
            HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.$userSession);
            C1BN<Uri> c1bn = HatchIdentityProvider.Companion.getInstance(this.$userSession).cachedAvatarUri;
            AnonymousClass001.A1J(new AnonymousClass1(gateway, null), c3ux);
            C20Q c20qA00 = GDB.A00(AnonymousClass3.INSTANCE, GDB.A01, new C10649I0t(C3rb.A03(new AnonymousClass2(null), gateway.getAiIdentity(), c1bn), 2));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$context, this.$userSession);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (c20qA00.collect(anonymousClass4, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<HxE<? extends AiIdentity, ? extends Uri>, HxE<? extends String, ? extends Uri>> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final HxE<String, Uri> invoke2(HxE<AiIdentity, ? extends Uri> hxE) {
            C7384Etj.A0Y(hxE, 0);
            AiIdentity aiIdentity = hxE.first;
            return new HxE<>(aiIdentity.name, hxE.second);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ HxE<? extends String, ? extends Uri> invoke(HxE<? extends AiIdentity, ? extends Uri> hxE) {
            return invoke2((HxE<AiIdentity, ? extends Uri>) hxE);
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
