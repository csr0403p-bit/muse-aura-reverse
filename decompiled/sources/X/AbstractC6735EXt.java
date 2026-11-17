package X;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

/* renamed from: X.EXt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6735EXt<T> {
    public abstract T read(EY1 ey1);

    public abstract void write(C6733EXr c6733EXr, T t);

    public static JsonSyntaxException A02(EY1 ey1, String str, String str2, Throwable th) {
        return new JsonSyntaxException(FGI.A0d("Failed parsing '", str, str2, ey1.A0T()), th);
    }

    public final T fromJson(Reader reader) {
        return read(new EY1(reader));
    }

    public final T fromJsonTree(JsonElement jsonElement) {
        try {
            C6731EXp c6731EXp = new C6731EXp(C6731EXp.A04);
            c6731EXp.A02 = new Object[32];
            c6731EXp.A00 = 0;
            c6731EXp.A03 = new String[32];
            c6731EXp.A01 = new int[32];
            C6731EXp.A03(c6731EXp, jsonElement);
            return read(c6731EXp);
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final AbstractC6735EXt<T> nullSafe() {
        return !(this instanceof C6737EXv) ? new C6737EXv(this) : this;
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final JsonElement toJsonTree(T t) {
        try {
            EXM exm = new EXM();
            write(exm, t);
            List<JsonElement> list = exm.A02;
            if (list.isEmpty()) {
                return exm.A00;
            }
            throw C3cG.A0Q(AnonymousClass007.A0a("Expected one JSON element but was ", list));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, T t) {
        write(new C6733EXr(writer), t);
    }
}
