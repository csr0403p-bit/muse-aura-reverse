package com.facebook.aura.deeplink;

import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFI;
import X.BzK;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.CH0;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GB9;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.onboarding.OnboardingStartupGate;
import com.facebook.aura.utils.HatchUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class HatchCardTokenPrompts implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final long AUTO_SEND_LIFETIME_MS = 604800000;
    public static final Companion Companion = new Companion();
    public static final int RESOLVE_ATTEMPTS = 3;
    public static final long RESOLVE_RETRY_DELAY_MS = 1000;
    public static final String TAG = "HatchCardTokenPrompts";
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.deeplink.HatchCardTokenPrompts", f = "HatchCardTokenPrompts.kt", l = {53, 147}, m = "resolveSavedPrompt", v = 2)
    /* renamed from: com.facebook.aura.deeplink.HatchCardTokenPrompts$resolveSavedPrompt$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCardTokenPrompts.this.resolveSavedPrompt(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.deeplink.HatchCardTokenPrompts$stage$1", f = "HatchCardTokenPrompts.kt", l = {36, R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.deeplink.HatchCardTokenPrompts$stage$1, reason: invalid class name and case insensitive filesystem */
    public final class C115761 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ String $linkPrompt;
        public final /* synthetic */ String $token;
        public int I$0;
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.deeplink.HatchCardTokenPrompts$stage$1$1", f = "HatchCardTokenPrompts.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.deeplink.HatchCardTokenPrompts$stage$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01371 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ boolean $autoSend;
            public final /* synthetic */ String $imageUrl;
            public final /* synthetic */ String $linkPrompt;
            public final /* synthetic */ String $savedPrompt;
            public int label;
            public final /* synthetic */ HatchCardTokenPrompts this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01371(String str, boolean z, HatchCardTokenPrompts hatchCardTokenPrompts, String str2, String str3, HtJ<? super C01371> htJ) {
                super(2, htJ);
                this.$savedPrompt = str;
                this.$autoSend = z;
                this.this$0 = hatchCardTokenPrompts;
                this.$imageUrl = str2;
                this.$linkPrompt = str3;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01371(this.$savedPrompt, this.$autoSend, this.this$0, this.$imageUrl, this.$linkPrompt, htJ);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
            
                if (r3.$imageUrl == null) goto L10;
             */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    int r0 = r3.label
                    if (r0 != 0) goto L2e
                    X.Hwg.A00(r4)
                    java.lang.String r2 = r3.$savedPrompt
                    if (r2 == 0) goto L1e
                    boolean r0 = r3.$autoSend
                    if (r0 == 0) goto L26
                    com.facebook.aura.deeplink.HatchCardTokenPrompts r1 = r3.this$0
                    java.lang.String r0 = r3.$imageUrl
                    com.facebook.aura.deeplink.HatchCardTokenPrompts.access$stageAutoSend(r1, r2, r0)
                L16:
                    com.facebook.aura.conversation.common.HatchPendingMessage r0 = com.facebook.aura.conversation.common.HatchPendingMessage.INSTANCE
                    r0.notifyShareDataReady()
                L1b:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L1e:
                    java.lang.String r2 = r3.$linkPrompt
                    if (r2 != 0) goto L26
                    java.lang.String r0 = r3.$imageUrl
                    if (r0 == 0) goto L1b
                L26:
                    com.facebook.aura.deeplink.HatchCardTokenPrompts r1 = r3.this$0
                    java.lang.String r0 = r3.$imageUrl
                    com.facebook.aura.deeplink.HatchCardTokenPrompts.access$stagePrefill(r1, r2, r0)
                    goto L16
                L2e:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.deeplink.HatchCardTokenPrompts.C115761.C01371.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C01371) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v2 */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ?? r6;
            Object objResolveSavedPrompt = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchCardTokenPrompts hatchCardTokenPrompts = HatchCardTokenPrompts.this;
                String str = this.$token;
                this.label = 1;
                objResolveSavedPrompt = hatchCardTokenPrompts.resolveSavedPrompt(str, this);
                if (objResolveSavedPrompt == enumC10460Hji) {
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
            String str2 = (String) objResolveSavedPrompt;
            if (str2 == null || !HatchCardTokenPrompts.this.mayAutoSend(this.$token)) {
                r6 = 0;
            } else {
                r6 = 1;
                HatchCardTokenPrompts.this.recordAutoSend(this.$token);
            }
            GB9 gb9 = AuraDispatchers.main;
            C01371 c01371 = new C01371(str2, r6, HatchCardTokenPrompts.this, this.$imageUrl, this.$linkPrompt, null);
            this.L$0 = null;
            this.I$0 = r6;
            this.label = 2;
            if (GAo.A00(this, gb9, c01371) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115761(String str, String str2, String str3, HtJ<? super C115761> htJ) {
            super(2, htJ);
            this.$token = str;
            this.$imageUrl = str2;
            this.$linkPrompt = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCardTokenPrompts.this.new C115761(this.$token, this.$imageUrl, this.$linkPrompt, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115761) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void stage(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new C115761(str, str3, str2, null), this.scope);
    }

    public final class Companion {
        public final HatchCardTokenPrompts getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchCardTokenPrompts) abstractC3358CGz.A03(HatchCardTokenPrompts.class, new HatchCardTokenPrompts$Companion$getInstance$1(abstractC3358CGz));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String tokenKey(String str) {
            byte[] bArrA1T = C3cH.A1T(str);
            C7384Etj.A0U(bArrA1T);
            return BFI.A0C("", HatchCardTokenPrompts$Companion$tokenKey$1.INSTANCE, bArrA1T);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final C4oT getPrefs() {
        return AuraUserPrefs.INSTANCE.get(((CH0) this.userSession).A01, AuraUserPrefStore.CARD_TOKEN_AUTO_SENDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean mayAutoSend(String str) {
        return OnboardingStartupGate.Companion.getInstance(this.userSession).hasCompletedOnboarding() && !hasAutoSent(str) && HatchUtils.INSTANCE.isCardTokenAutoSendEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveSavedPrompt(java.lang.String r22, X.HtJ<? super java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.deeplink.HatchCardTokenPrompts.resolveSavedPrompt(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stageAutoSend(String str, String str2) {
        HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
        List<String> listA0z = AbstractC0885AGm.A0z(str2);
        HatchComposerEntryPoint hatchComposerEntryPoint = HatchComposerEntryPoint.CARD_AUTO_SEND;
        hatchPendingMessage.setPendingLinkImageUris(listA0z, hatchComposerEntryPoint);
        hatchPendingMessage.setPendingMessage(new HatchPendingMessage.PendingPayload(str, hatchComposerEntryPoint, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stagePrefill(String str, String str2) {
        if (str != null) {
            HatchPendingMessage.INSTANCE.setPendingComposerText(str, HatchComposerEntryPoint.DEEP_LINK);
        }
        HatchPendingMessage.INSTANCE.setPendingLinkImageUris(AbstractC0885AGm.A0z(str2), HatchComposerEntryPoint.DEEP_LINK);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public HatchCardTokenPrompts(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C78W.A03();
    }

    private final boolean hasAutoSent(String str) {
        return AnonymousClass002.A1N((getPrefs().getLong(Companion.tokenKey(str), 0L) > (System.currentTimeMillis() - 604800000) ? 1 : (getPrefs().getLong(Companion.tokenKey(str), 0L) == (System.currentTimeMillis() - 604800000) ? 0 : -1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.HashMap] */
    public final void recordAutoSend(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        BzK bzKA9q = getPrefs().A9q();
        Iterator itA0i = C3cG.A0i(getPrefs().ACL());
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            String strA0t = C60O.A0t(entryA0l);
            Object value = entryA0l.getValue();
            if (!(value instanceof Long) || C3cG.A05(value) <= jCurrentTimeMillis - 604800000) {
                bzKA9q.Aae(strA0t);
            }
        }
        bzKA9q.AYp(Companion.tokenKey(str), jCurrentTimeMillis);
        bzKA9q.apply();
    }

    public /* synthetic */ HatchCardTokenPrompts(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
