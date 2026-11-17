package com.facebook.aura.sharesheet;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipients$2", f = "HatchShareSheetRepository.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetRepository$fetchRecipients$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends AHD<? extends HatchShareRecipient>>>, Object> {
    public final /* synthetic */ boolean $excludeOnboardedHatchUsers;
    public int label;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$fetchRecipients$2(HatchShareSheetRepository hatchShareSheetRepository, boolean z, HtJ<? super HatchShareSheetRepository$fetchRecipients$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchShareSheetRepository;
        this.$excludeOnboardedHatchUsers = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetRepository$fetchRecipients$2(this.this$0, this.$excludeOnboardedHatchUsers, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends AHD<? extends HatchShareRecipient>>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<? extends AHD<HatchShareRecipient>>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object c10571Hud;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                HatchShareSheetRepository hatchShareSheetRepository = this.this$0;
                boolean z = this.$excludeOnboardedHatchUsers;
                this.label = 1;
                obj = hatchShareSheetRepository.fetchRecipientsOnce(z, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            c10571Hud = AGI.A07((Iterable) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            c10571Hud = new C10571Hud(e2);
        }
        return new HsJ(c10571Hud);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<? extends AHD<HatchShareRecipient>>> htJ) {
        return ((HatchShareSheetRepository$fetchRecipients$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
