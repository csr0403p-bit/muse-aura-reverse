package X;

import android.content.Context;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.request.AggregateDataRequest;
import androidx.health.platform.client.request.GetChangesRequest;
import androidx.health.platform.client.request.GetChangesTokenRequest;
import androidx.health.platform.client.response.AggregateDataResponse;
import androidx.health.platform.client.response.GetChangesResponse;
import androidx.health.platform.client.response.GetChangesTokenResponse;
import androidx.health.platform.client.response.ReadDataRangeResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EY5 extends AbstractC7559F3s implements G0U {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EY5(int i) {
        super(1);
        this.$t = i;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws InterruptedException, IOException {
        switch (this.$t) {
            case 0:
                String strA13 = C8j3.A13(obj);
                GF3 gf3A05 = C9180Fzn.DEFAULT_INSTANCE.A05();
                gf3A05.A01();
                C9180Fzn c9180Fzn = (C9180Fzn) gf3A05.A00;
                c9180Fzn.bitField0_ |= 4;
                c9180Fzn.permission_ = strA13;
                return new Permission((C9180Fzn) gf3A05.A00());
            case 1:
                return ((Permission) obj).A00.permission_;
            case 2:
                C9185Fzs c9185Fzs = (C9185Fzs) GF2.A00(C9185Fzs.DEFAULT_INSTANCE, C7384Etj.A0e(obj));
                return ErrorStatus.A00((c9185Fzs.bitField0_ & 2) != 0 ? c9185Fzs.message_ : null, c9185Fzs.code_);
            case 3:
                C9180Fzn c9180Fzn2 = (C9180Fzn) GF2.A00(C9180Fzn.DEFAULT_INSTANCE, C7384Etj.A0e(obj));
                C7384Etj.A0X(c9180Fzn2);
                return new Permission(c9180Fzn2);
            case 4:
                C9170Fzd c9170Fzd = (C9170Fzd) GF2.A00(C9170Fzd.DEFAULT_INSTANCE, C7384Etj.A0e(obj));
                C7384Etj.A0X(c9170Fzd);
                return new AggregateDataRequest(c9170Fzd);
            case 5:
                C9186Fzt c9186Fzt = (C9186Fzt) GF2.A00(C9186Fzt.DEFAULT_INSTANCE, C7384Etj.A0e(obj));
                C7384Etj.A0X(c9186Fzt);
                return new GetChangesRequest(c9186Fzt);
            case 6:
                C9173Fzg c9173Fzg = (C9173Fzg) GF2.A00(C9173Fzg.DEFAULT_INSTANCE, C7384Etj.A0e(obj));
                C7384Etj.A0X(c9173Fzg);
                return new GetChangesTokenRequest(c9173Fzg);
            case 7:
                C9182Fzp c9182Fzp = (C9182Fzp) GF2.A00(C9182Fzp.DEFAULT_INSTANCE, C7384Etj.A0e(obj));
                C7384Etj.A0X(c9182Fzp);
                return new AggregateDataResponse(c9182Fzp);
            case 8:
                C9176Fzj c9176Fzj = (C9176Fzj) GF2.A00(C9176Fzj.DEFAULT_INSTANCE, C7384Etj.A0e(obj));
                C7384Etj.A0X(c9176Fzj);
                return new GetChangesResponse(c9176Fzj);
            case 9:
                C9189Fzw c9189Fzw = (C9189Fzw) GF2.A00(C9189Fzw.DEFAULT_INSTANCE, C7384Etj.A0e(obj));
                C7384Etj.A0X(c9189Fzw);
                return new GetChangesTokenResponse(c9189Fzw);
            case 10:
                C9177Fzk c9177Fzk = (C9177Fzk) GF2.A00(C9177Fzk.DEFAULT_INSTANCE, C7384Etj.A0e(obj));
                C7384Etj.A0X(c9177Fzk);
                return new ReadDataRangeResponse(c9177Fzk);
            case 11:
                return FGI.A0M(C8j3.A13(obj), "_C");
            case 12:
                return FGI.A0M(C8j3.A13(obj), "_N");
            case 13:
                List list = (List) obj;
                C7384Etj.A0Y(list, 0);
                return new EF6(null, null, list);
            case 14:
                List list2 = (List) obj;
                C7384Etj.A0Y(list2, 0);
                return new EF7(null, null, list2, null);
            case 15:
                throw BV4.A0a("timestamp");
            case 16:
                throw BV4.A0a("timestamp");
            case 17:
                C7384Etj.A0Y(null, 0);
                throw F60.createAndThrow();
            case 18:
                Throwable th = (Throwable) obj;
                C7384Etj.A0Y(th, 0);
                return th.getCause();
            case 19:
                Context context = (Context) obj;
                C7384Etj.A0Y(context, 0);
                Object systemService = context.getSystemService("connectivity");
                C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                return systemService;
            case 20:
                Thread.sleep(C3cG.A05(obj));
                return Unit.INSTANCE;
            case 21:
                File file = (File) obj;
                if (file == null) {
                    throw BV4.A0U();
                }
                String canonicalPath = file.getCanonicalPath();
                C7384Etj.A0U(canonicalPath);
                return canonicalPath;
            case 22:
                HxE hxE = (HxE) obj;
                C7384Etj.A0Y(hxE, 0);
                return ((DB6) hxE.first).getName();
            case 23:
                return Unit.INSTANCE;
            case 24:
                EP1 ep1 = (EP1) obj;
                C7384Etj.A0Y(ep1, 0);
                return ep1.name();
            default:
                return null;
        }
    }
}
