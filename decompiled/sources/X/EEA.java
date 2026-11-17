package X;

import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoPaginationService;
import com.facebook.pando.PandoPrimaryExecution;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EEA extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EEA(Object obj, DZK dzk, F0C<? extends PandoPrimaryExecution> f0c, DYp dYp) {
        super(0);
        this.$t = dYp;
        this.A00 = obj;
        this.A01 = f0c;
        this.A02 = dzk;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.$t != 0) {
            AbstractC6792Ea1 abstractC6792Ea1 = ((C6787EZw) this.A01).A01;
            C7384Etj.A0X(abstractC6792Ea1);
            return abstractC6792Ea1.A00((List) ((C6797Ea8) this.A02).A01.getValue(), ((C6856EbE) this.A00).A09.A02);
        }
        DZK dzk = (DZK) this.A00;
        if (dzk == null) {
            throw C3cG.A0Q("Pagination service is required for paginating");
        }
        F0C f0c = (F0C) this.A01;
        if (f0c == null) {
            throw C3cG.A0Q("Primary execution is required for pagination");
        }
        PandoConsistencyServiceJNI pandoConsistencyServiceJNI = ((DYp) this.A02).A04.getValue().consistencyService;
        PandoPrimaryExecution pandoPrimaryExecution = (PandoPrimaryExecution) f0c.getValue();
        AnonymousClass003.A0u(pandoConsistencyServiceJNI, pandoPrimaryExecution);
        PandoPaginationService pandoPaginationService = PandoPaginationService.$redex_init_class;
        return new PandoPaginationService(pandoConsistencyServiceJNI, pandoPrimaryExecution, ((DZ0) dzk).A00.getValue(), false);
    }
}
