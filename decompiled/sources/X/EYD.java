package X;

import com.google.gson.annotations.JsonAdapter;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class EYD implements EYY {
    public static final EYY A02 = new EYV();
    public final EYQ A00;
    public final ConcurrentMap<Class<?>, EYY> A01 = C60O.A1C();

    @Override // X.EYY
    public final <T> AbstractC6735EXt<T> create(EYC eyc, C6753EYn<T> c6753EYn) {
        JsonAdapter jsonAdapter = (JsonAdapter) c6753EYn.A01.getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return A00(eyc, jsonAdapter, this.A00, c6753EYn, true);
    }

    public EYD(EYQ eyq) {
        this.A00 = eyq;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/EYQ;LX/EYC;LX/EYn<*>;Lcom/google/gson/annotations/JsonAdapter;Z)LX/EXt<*>; */
    public final AbstractC6735EXt A00(EYC eyc, JsonAdapter jsonAdapter, EYQ eyq, C6753EYn c6753EYn, boolean z) {
        AbstractC6735EXt abstractC6735EXtCreate;
        Object objA6t = eyq.A01(new C6753EYn(jsonAdapter.value())).A6t();
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objA6t instanceof AbstractC6735EXt) {
            abstractC6735EXtCreate = (AbstractC6735EXt) objA6t;
        } else {
            if (!(objA6t instanceof EYY)) {
                throw C60O.A0i(FGI.A0h("Invalid attempt to bind an instance of ", C60Q.A0e(objA6t), " as a @JsonAdapter for ", c6753EYn.toString(), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."));
            }
            EYY eyy = (EYY) objA6t;
            if (z) {
                EYY eyyPutIfAbsent = this.A01.putIfAbsent(c6753EYn.A01, eyy);
                if (eyyPutIfAbsent != null) {
                    eyy = eyyPutIfAbsent;
                }
            }
            abstractC6735EXtCreate = eyy.create(eyc, c6753EYn);
        }
        return (abstractC6735EXtCreate == null || !zNullSafe) ? abstractC6735EXtCreate : abstractC6735EXtCreate.nullSafe();
    }
}
