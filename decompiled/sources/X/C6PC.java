package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* renamed from: X.6PC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PC extends AbstractC7559F3s implements Function0<File> {
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ C6LS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6PC(Context context, C6LS c6ls) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = c6ls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ File invoke() {
        Context context = this.$applicationContext;
        C7384Etj.A0T(context);
        return C6PJ.A00(context, this.this$0.A01);
    }
}
