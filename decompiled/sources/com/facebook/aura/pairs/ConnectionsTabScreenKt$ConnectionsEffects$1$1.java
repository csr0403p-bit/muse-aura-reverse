package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchShareDestination;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsEffects$1$1", f = "ConnectionsTabScreen.kt", l = {486}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ConnectionsTabScreenKt$ConnectionsEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $shareTitle;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ ConnectionsViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabScreenKt$ConnectionsEffects$1$1(ConnectionsViewModel connectionsViewModel, Context context, String str, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, HtJ<? super ConnectionsTabScreenKt$ConnectionsEffects$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = connectionsViewModel;
        this.$context = context;
        this.$shareTitle = str;
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConnectionsTabScreenKt$ConnectionsEffects$1$1(this.$viewModel, this.$context, this.$shareTitle, this.$userSession, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConnectionsEffect> c22i = this.$viewModel.effects;
            final Context context = this.$context;
            final String str = this.$shareTitle;
            final AbstractC3358CGz abstractC3358CGz = this.$userSession;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super ConnectionsEffect> c20z = new C20Z() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsEffects$1$1.1

                /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsEffects$1$1$1$WhenMappings */
                /* loaded from: classes.dex */
                public abstract /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[HatchShareDestination.values().length];
                        try {
                            AnonymousClass002.A13(HatchShareDestination.OS_MESSAGES, iArr);
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            AnonymousClass002.A14(HatchShareDestination.MESSENGER, iArr);
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            AnonymousClass002.A15(HatchShareDestination.WHATSAPP, iArr);
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
                
                    if (r0 == false) goto L23;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(com.facebook.aura.pairs.ConnectionsEffect r6, X.HtJ<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r6 instanceof com.facebook.aura.pairs.ConnectionsEffect.Message
                        if (r0 == 0) goto L10
                        com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
                        com.facebook.aura.pairs.ConnectionsEffect$Message r6 = (com.facebook.aura.pairs.ConnectionsEffect.Message) r6
                        int r0 = r6.res
                        r1.showToast(r0)
                    Ld:
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                    L10:
                        boolean r0 = r6 instanceof com.facebook.aura.pairs.ConnectionsEffect.ShareLink
                        if (r0 == 0) goto L25
                        android.content.Context r2 = r1
                        com.facebook.aura.pairs.ConnectionsEffect$ShareLink r6 = (com.facebook.aura.pairs.ConnectionsEffect.ShareLink) r6
                        java.lang.String r1 = r6.url
                    L1a:
                        java.lang.String r0 = r2
                        java.lang.Object r1 = com.facebook.aura.pairs.ConnectionsTabScreenKt.shareConnectionsUrl(r2, r1, r0, r7)
                        X.Hji r0 = X.EnumC10460Hji.A02
                        if (r1 != r0) goto Ld
                        return r1
                    L25:
                        boolean r0 = r6 instanceof com.facebook.aura.pairs.ConnectionsEffect.ShareInviteLink
                        if (r0 == 0) goto L65
                        com.facebook.aura.pairs.ConnectionsEffect$ShareInviteLink r6 = (com.facebook.aura.pairs.ConnectionsEffect.ShareInviteLink) r6
                        com.facebook.aura.sharesheet.HatchShareDestination r0 = r6.destination
                        int r1 = r0.ordinal()
                        r0 = 9
                        if (r1 == r0) goto L5a
                        r0 = 6
                        if (r1 == r0) goto L4e
                        r0 = 4
                        if (r1 != r0) goto L49
                        com.facebook.aura.file.actions.HatchShare r3 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                        android.content.Context r2 = r1
                        java.lang.String r1 = r6.url
                        java.lang.String r0 = "com.whatsapp"
                        boolean r0 = r3.shareTextToWhatsApp(r2, r1, r0)
                    L47:
                        if (r0 != 0) goto Ld
                    L49:
                        android.content.Context r2 = r1
                        java.lang.String r1 = r6.url
                        goto L1a
                    L4e:
                        com.facebook.aura.file.actions.HatchShare r3 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                        android.content.Context r2 = r1
                        java.lang.String r1 = r6.url
                        r0 = 0
                        boolean r0 = r3.shareTextToMessenger(r2, r1, r0, r0)
                        goto L47
                    L5a:
                        com.facebook.aura.file.actions.HatchShare r2 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                        android.content.Context r1 = r1
                        java.lang.String r0 = r6.url
                        boolean r0 = r2.shareTextToMessages(r1, r0)
                        goto L47
                    L65:
                        boolean r0 = r6 instanceof com.facebook.aura.pairs.ConnectionsEffect.OpenFile
                        if (r0 == 0) goto L85
                        com.facebook.aura.pairs.ConnectionsEffect$OpenFile r6 = (com.facebook.aura.pairs.ConnectionsEffect.OpenFile) r6
                        java.lang.String r4 = r6.path
                        java.lang.String r3 = r6.name
                        java.lang.String r2 = r6.mimeType
                        X.CGz r1 = r3
                        com.facebook.aura.navigation.AuraNavigator r0 = r4
                        boolean r0 = com.facebook.aura.pairs.ConnectionsActivityItemsKt.openConnectionsFile(r4, r3, r2, r1, r0)
                        if (r0 != 0) goto Ld
                        com.facebook.aura.navigation.AuraNavKey r1 = r6.fallback
                        if (r1 == 0) goto Ld
                        com.facebook.aura.navigation.AuraNavigator r0 = r4
                    L81:
                        com.facebook.aura.pairs.ConnectionsActivityItemsKt.open(r0, r1)
                        goto Ld
                    L85:
                        boolean r0 = r6 instanceof com.facebook.aura.pairs.ConnectionsEffect.Open
                        if (r0 == 0) goto L90
                        com.facebook.aura.navigation.AuraNavigator r0 = r4
                        com.facebook.aura.pairs.ConnectionsEffect$Open r6 = (com.facebook.aura.pairs.ConnectionsEffect.Open) r6
                        com.facebook.aura.navigation.AuraNavKey r1 = r6.destination
                        goto L81
                    L90:
                        boolean r0 = r6 instanceof com.facebook.aura.pairs.ConnectionsEffect.OpenUrl
                        if (r0 == 0) goto La5
                        X.CGz r0 = r3
                        com.facebook.aura.pairs.ConnectionsEffect$OpenUrl r6 = (com.facebook.aura.pairs.ConnectionsEffect.OpenUrl) r6
                        java.lang.String r1 = r6.url
                        android.content.Context r2 = r1
                        com.facebook.aura.navigation.AuraNavigator r3 = r4
                        r4 = 0
                        r5 = r4
                        com.facebook.aura.conversation.view.HatchUrlClickHandlerKt.handleUrlClick(r0, r1, r2, r3, r4, r5)
                        goto Ld
                    La5:
                        kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsEffects$1$1.AnonymousClass1.emit(com.facebook.aura.pairs.ConnectionsEffect, X.HtJ):java.lang.Object");
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConnectionsEffect) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
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
        return ((ConnectionsTabScreenKt$ConnectionsEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
