package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.email.viewmodel.EmailSenderNameError;
import com.facebook.aura.email.viewmodel.EmailState;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class EmailSenderNameErrorKt {

    /* renamed from: com.facebook.aura.email.view.EmailSenderNameErrorKt$EmailSenderNameError$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmailState emailState, BRg bRg, int i, int i2) {
            super(2);
            this.$state = emailState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailSenderNameErrorKt.EmailSenderNameError(this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailSenderNameError.values().length];
            try {
                AnonymousClass002.A13(EmailSenderNameError.CHARACTERS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(EmailSenderNameError.LENGTH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(EmailSenderNameError.REJECTED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailSenderNameError(com.facebook.aura.email.viewmodel.EmailState r21, X.BRg r22, X.BFM r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailSenderNameErrorKt.EmailSenderNameError(com.facebook.aura.email.viewmodel.EmailState, X.BRg, X.BFM, int, int):void");
    }
}
