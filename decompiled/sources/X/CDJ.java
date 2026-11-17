package X;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import kotlin.Deprecated;

@Deprecated(message = "Use Flatbuffers and Dracula fragment models.")
/* loaded from: classes5.dex */
public final class CDJ {
    public static final CDJ A00 = new CDJ();

    public static final String A00(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return jsonReader.nextString();
        }
        jsonReader.nextNull();
        return null;
    }

    public static final void A01(JsonReader jsonReader, JsonWriter jsonWriter, CDJ cdj) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek != null) {
            switch (AbstractC3326CEr.A00[jsonTokenPeek.ordinal()]) {
                case 1:
                    jsonWriter.nullValue();
                    jsonReader.nextNull();
                    break;
                case 2:
                case 3:
                    jsonWriter.value(jsonReader.nextString());
                    break;
                case 4:
                    jsonWriter.value(jsonReader.nextBoolean());
                    break;
                case 5:
                    jsonWriter.beginArray();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        A01(jsonReader, jsonWriter, cdj);
                    }
                    jsonReader.endArray();
                    jsonWriter.endArray();
                    break;
                case 6:
                    jsonWriter.beginObject();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        jsonWriter.name(jsonReader.nextName());
                        A01(jsonReader, jsonWriter, cdj);
                    }
                    jsonReader.endObject();
                    jsonWriter.endObject();
                    break;
            }
        }
    }

    public static final void A02(JsonWriter jsonWriter, String str, String str2) throws IOException {
        jsonWriter.name(str);
        if (str2 == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(str2);
        }
    }
}
