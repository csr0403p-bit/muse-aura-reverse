package X;

import android.content.Context;
import kotlin.Unit;
import libraries.accessv2.src.model.FXAccessException;

/* loaded from: classes5.dex */
public final class EOT extends AbstractC7559F3s implements G0V<ENr, EP0, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ EP1 $credentialSource;
    public final /* synthetic */ EOH $query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EOT(Context context, EP1 ep1, EOH eoh) {
        super(2);
        this.$context = context;
        this.$credentialSource = ep1;
        this.$query = eoh;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(ENr eNr, EP0 ep0) throws FXAccessException {
        ENr eNr2 = eNr;
        EP0 ep02 = ep0;
        AnonymousClass003.A0u(eNr2, ep02);
        eNr2.A01(this.$context, this.$query.A00, ep02, this.$credentialSource);
        return Unit.INSTANCE;
    }
}
