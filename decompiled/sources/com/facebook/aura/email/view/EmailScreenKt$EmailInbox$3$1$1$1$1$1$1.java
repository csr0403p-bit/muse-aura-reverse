package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.keys.EmailIntroKey;
import com.facebook.aura.email.keys.EmailSenderNameKey;
import com.facebook.aura.email.model.EmailRestrictionActionKind;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailInbox$3$1$1$1$1$1$1 extends AbstractC7559F3s implements G0U<EmailRestrictionActionKind, Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailInboxSessionViewModel $inboxSession;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EmailRestrictionActionKind emailRestrictionActionKind) {
        AuraNavigator auraNavigator;
        AuraNavKey emailSenderNameKey;
        C7384Etj.A0Y(emailRestrictionActionKind, 0);
        this.$inboxSession.isPageOnTop = true;
        int iOrdinal = emailRestrictionActionKind.ordinal();
        if (iOrdinal == 0) {
            auraNavigator = this.$navigator;
            emailSenderNameKey = new EmailSenderNameKey(this.$environmentId);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            auraNavigator = this.$navigator;
            emailSenderNameKey = new EmailIntroKey(this.$environmentId);
        }
        auraNavigator.navigate(emailSenderNameKey, false);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailRestrictionActionKind.values().length];
            try {
                AnonymousClass002.A13(EmailRestrictionActionKind.EDIT_SENDER_NAME, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(EmailRestrictionActionKind.CREATE_EMAIL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailInbox$3$1$1$1$1$1$1(EmailInboxSessionViewModel emailInboxSessionViewModel, AuraNavigator auraNavigator, String str) {
        super(1);
        this.$inboxSession = emailInboxSessionViewModel;
        this.$navigator = auraNavigator;
        this.$environmentId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(EmailRestrictionActionKind emailRestrictionActionKind) {
        invoke2(emailRestrictionActionKind);
        return Unit.INSTANCE;
    }
}
