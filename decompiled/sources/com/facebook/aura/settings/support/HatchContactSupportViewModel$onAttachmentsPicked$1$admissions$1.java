package com.facebook.aura.settings.support;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.net.Uri;
import com.facebook.aura.settings.support.HelpTicketAttachmentFiles;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1", f = "HatchContactSupportViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Map<Uri, ? extends HelpTicketAttachmentFiles.Admission>>, Object> {
    public final /* synthetic */ List<Uri> $uris;
    public int label;
    public final /* synthetic */ HatchContactSupportViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1(List<? extends Uri> list, HatchContactSupportViewModel hatchContactSupportViewModel, HtJ<? super HatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1> htJ) {
        super(2, htJ);
        this.$uris = list;
        this.this$0 = hatchContactSupportViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1(this.$uris, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        List listA0T = AbstractC0878AGe.A0T(this.$uris);
        HatchContactSupportViewModel hatchContactSupportViewModel = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(listA0T));
        for (Object obj2 : listA0T) {
            linkedHashMap.put(obj2, HelpTicketAttachmentFiles.INSTANCE.admit(hatchContactSupportViewModel.appContext, (Uri) obj2));
        }
        return linkedHashMap;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Map<Uri, ? extends HelpTicketAttachmentFiles.Admission>> htJ) {
        return ((HatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
