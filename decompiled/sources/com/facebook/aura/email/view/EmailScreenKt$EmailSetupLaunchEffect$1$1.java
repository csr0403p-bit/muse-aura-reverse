package com.facebook.aura.email.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.email.keys.EmailIntroKey;
import com.facebook.aura.email.keys.EmailSendersKey;
import com.facebook.aura.email.keys.EmailSettingsKey;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;
import com.facebook.aura.email.viewmodel.EmailLaunchDestination;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.email.view.EmailScreenKt$EmailSetupLaunchEffect$1$1", f = "EmailScreen.kt", l = {170}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailScreenKt$EmailSetupLaunchEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $action;
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailInboxSessionViewModel $inboxSession;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onHandled;
    public int label;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailLaunchDestination.values().length];
            try {
                AnonymousClass002.A13(EmailLaunchDestination.INTRO, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(EmailLaunchDestination.SETTINGS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(EmailLaunchDestination.SENDERS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailSetupLaunchEffect$1$1(String str, EmailViewModel emailViewModel, Function0<Unit> function0, EmailInboxSessionViewModel emailInboxSessionViewModel, AuraNavigator auraNavigator, String str2, HtJ<? super EmailScreenKt$EmailSetupLaunchEffect$1$1> htJ) {
        super(2, htJ);
        this.$action = str;
        this.$model = emailViewModel;
        this.$onHandled = function0;
        this.$inboxSession = emailInboxSessionViewModel;
        this.$navigator = auraNavigator;
        this.$environmentId = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new EmailScreenKt$EmailSetupLaunchEffect$1$1(this.$action, this.$model, this.$onHandled, this.$inboxSession, this.$navigator, this.$environmentId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AuraNavigator auraNavigator;
        AuraNavKey emailIntroKey;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            String str = this.$action;
            if (str != null) {
                EmailViewModel emailViewModel = this.$model;
                this.label = 1;
                obj = emailViewModel.awaitLaunchDestination(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        EmailLaunchDestination emailLaunchDestination = (EmailLaunchDestination) obj;
        this.$onHandled.invoke();
        if (emailLaunchDestination != null) {
            this.$inboxSession.isPageOnTop = true;
            int iOrdinal = emailLaunchDestination.ordinal();
            if (iOrdinal != -1) {
                if (iOrdinal == 0) {
                    auraNavigator = this.$navigator;
                    emailIntroKey = new EmailIntroKey(this.$environmentId);
                } else if (iOrdinal == 1) {
                    auraNavigator = this.$navigator;
                    emailIntroKey = new EmailSettingsKey(this.$environmentId);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.$navigator.navigate((AuraNavKey) new EmailSettingsKey(this.$environmentId), false);
                    auraNavigator = this.$navigator;
                    emailIntroKey = new EmailSendersKey(this.$environmentId);
                }
                auraNavigator.navigate(emailIntroKey, false);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((EmailScreenKt$EmailSetupLaunchEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
