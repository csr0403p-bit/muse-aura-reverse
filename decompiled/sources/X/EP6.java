package X;

import android.app.Activity;
import com.facebook.aura.qpl.AuraStartupDeviceState;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.MarkerEditor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EP6 extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EP6(F1O f1o) {
        super(1);
        this.$t = 2;
        this.A00 = null;
        this.A01 = f1o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws Exception {
        MarkerEditor markerEditorA01;
        switch (this.$t) {
            case 0:
                C7384Etj.A0Y(obj, 0);
                return ((PandoGraphQLRequest) this.A01).responseConstructor.invoke(((G0U) this.A00).invoke(obj));
            case 1:
                Throwable th = (Throwable) obj;
                C7384Etj.A0Y(th, 0);
                ((Function0) this.A01).invoke();
                BV7.A1K(th, (HtJ) this.A00);
                return Unit.INSTANCE;
            case 2:
                PushInfraMetaData pushInfraMetaData = (PushInfraMetaData) obj;
                C7384Etj.A0Y(pushInfraMetaData, 0);
                String.valueOf(pushInfraMetaData.A00);
                String.valueOf(pushInfraMetaData.A02);
                try {
                    throw new ClassNotFoundException(FGI.A0H("Unexpected type tag: ", 91327477));
                } catch (Exception e) {
                    if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                        throw BV4.A0e(e);
                    }
                    throw e;
                }
            case 3:
                byte bByteValue = ((Number) obj).byteValue();
                byte[] bArr = (byte[]) this.A00;
                F1E f1e = (F1E) this.A01;
                int i = f1e.element;
                f1e.element = i + 1;
                bArr[i] = bByteValue;
                return Unit.INSTANCE;
            case 4:
                markerEditorA01 = AbstractC7559F3s.A01(obj);
                markerEditorA01.annotate(DBJ.COLD_START_MODE_ANNOTATION, BackgroundStartupDetector._coldStartMode);
                break;
            default:
                markerEditorA01 = AbstractC7559F3s.A01(obj);
                break;
        }
        AuraStartupDeviceState.INSTANCE.annotateStart(markerEditorA01);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EP6(int i, DBJ<ColdInfo> dbj, Activity activity) {
        super(1);
        this.$t = i;
        this.A01 = activity;
        this.A00 = dbj;
    }
}
