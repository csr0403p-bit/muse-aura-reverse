package com.facebook.acra.util.minidump;

import X.AnonymousClass002;
import X.BV4;
import X.C60O;
import X.CFK;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* loaded from: classes5.dex */
public class MinidumpReader {
    public static final String ALT_STACK = "WriteThreadUnwindStream failed";
    public static final String CUSTOM_STREAM_GLOBAL = "global";
    public static final String LOG_TAG = "MinidumpReader";
    public static final int MD_FB_APP_CUSTOM_DATA = -87110918;
    public static final int MD_FB_APP_STATE_LOG = -87110452;
    public static final int MD_FB_APP_VERSION_CODE = -87110917;
    public static final int MD_FB_APP_VERSION_NAME = -87110916;
    public static final int MD_FB_DUMP_ERROR_LOG = -87110912;
    public static final int MD_FB_JAVA_STACK = -87110915;
    public static final int MD_FB_STREAM_MARKERS = -87162880;
    public static final long MD_FB_UNWIND_SYMBOLS_OFFSET = 17592186044416L;
    public static final int MD_HEADER_SIGNATURE = 1347241037;
    public static final int MD_LINUX_CMD_LINE = 1197932550;
    public static final int MD_MODULE_LIST_STREAM = 4;
    public static final int MD_MODULE_LIST_STREAM_OFFSET = 16;
    public static final int MD_THREAD_LIST_STREAM_OFFSET = 8;
    public static final int MODULE_FULL_SIZE = 108;
    public static final String MODULE_LIST = "WriteMappings failed";
    public static final int MODULE_LIST_OFFSET = 24;
    public static final String THREAD_LIST = "WriteThreadListStream failed";
    public RandomAccessFile mHandle;
    public int mStreamCount;
    public int mStreamsPos;

    public static JsonReader retrieveJsonNode(JsonReader jsonReader, String str) throws IOException {
        if (jsonReader != null) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    if (strNextName.equals(str)) {
                        return jsonReader;
                    }
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        }
        return null;
    }

    public HashSet<String> getModuleList() throws IOException {
        try {
            MDLocationDescription mDLocationDescriptionFindStream = findStream(4);
            if (mDLocationDescriptionFindStream == null) {
                CFK.A04(LOG_TAG, "Stream is Null");
                return null;
            }
            this.mHandle.seek(mDLocationDescriptionFindStream.pos);
            int intLE = readIntLE();
            HashSet<String> hashSetA13 = C60O.A13();
            int i = mDLocationDescriptionFindStream.pos;
            for (int i2 = 0; i2 < intLE; i2++) {
                this.mHandle.seek(i + 24);
                this.mHandle.seek(readIntLE());
                String moduleString = getModuleString(new MDLocationDescription((int) this.mHandle.getFilePointer(), readIntLE()));
                if (isSystemModule(moduleString)) {
                    hashSetA13.add(moduleString);
                }
                i += MODULE_FULL_SIZE;
            }
            return hashSetA13;
        } catch (IOException e) {
            CFK.A0J(LOG_TAG, e, "getModuleList failed to read");
            return null;
        }
    }

    public class MDLocationDescription {
        public int pos;
        public int size;

        public MDLocationDescription(int i, int i2) {
            this.pos = i;
            this.size = i2;
        }
    }

    public class MinidumpMarkers {
        public long endMarker;
        public long startMarker;

        public MinidumpMarkers(long j, long j2) {
            this.startMarker = j;
            this.endMarker = j2;
        }
    }

    public static boolean checkMinidumpErrLogStream(String str) {
        if (str == null) {
            return false;
        }
        if (str.contains(MODULE_LIST)) {
            return true;
        }
        return str.contains(THREAD_LIST) && str.contains(ALT_STACK);
    }

    public static boolean checkMinidumpMarkerStream(long j) {
        return AnonymousClass002.A1L(((16 & j) > 0L ? 1 : ((16 & j) == 0L ? 0 : -1))) || (AnonymousClass002.A1L(((8 & j) > 0L ? 1 : ((8 & j) == 0L ? 0 : -1))) && AnonymousClass002.A1L(((j & MD_FB_UNWIND_SYMBOLS_OFFSET) > 0L ? 1 : ((j & MD_FB_UNWIND_SYMBOLS_OFFSET) == 0L ? 0 : -1))));
    }

    private MDLocationDescription findStream(int i) throws IOException {
        this.mHandle.seek(this.mStreamsPos);
        for (int i2 = 0; i2 < this.mStreamCount; i2++) {
            int intLE = readIntLE();
            int intLE2 = readIntLE();
            int intLE3 = readIntLE();
            if (intLE == i) {
                return new MDLocationDescription(intLE3, intLE2);
            }
        }
        return null;
    }

    private Integer getInt(MDLocationDescription mDLocationDescription) throws IOException {
        if (mDLocationDescription == null || mDLocationDescription.size != 4) {
            return null;
        }
        this.mHandle.seek(mDLocationDescription.pos);
        return Integer.valueOf(readIntLE());
    }

    private String getModuleString(MDLocationDescription mDLocationDescription) throws IOException {
        this.mHandle.seek(mDLocationDescription.pos);
        int i = mDLocationDescription.size;
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[i / 2];
        this.mHandle.read(bArr);
        for (int i2 = 0; i2 < mDLocationDescription.size / 2; i2++) {
            bArr2[i2] = bArr[i2 * 2];
        }
        return new String(bArr2);
    }

    private String getString(MDLocationDescription mDLocationDescription) throws IOException {
        if (mDLocationDescription == null) {
            return null;
        }
        this.mHandle.seek(mDLocationDescription.pos);
        byte[] bArr = new byte[mDLocationDescription.size];
        this.mHandle.read(bArr);
        return new String(bArr);
    }

    public static boolean isSystemModule(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("/system") || str.startsWith("/apex") || str.startsWith("/vendor") || str.startsWith("/odm")) {
            return str.endsWith(".so") || str.contains("app_process") || str.endsWith("linker");
        }
        return false;
    }

    private int readIntLE() throws IOException {
        int i = this.mHandle.readInt();
        return ((i >> 24) & 255) | ((i & 255) << 24) | ((65280 & i) << 8) | ((16711680 & i) >> 8);
    }

    private long readLongIntLE() throws IOException {
        long j = this.mHandle.readLong();
        return ((j >> 56) & 255) | ((j & 255) << 56) | (((j >> 8) & 255) << 48) | (((j >> 16) & 255) << 40) | (((j >> 24) & 255) << 32) | (((j >> 32) & 255) << 24) | (((j >> 40) & 255) << 16) | (((j >> 48) & 255) << 8);
    }

    public String getCustomDataFromJson(String str, String str2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            JsonReader jsonReaderRetrieveJsonNode = retrieveJsonNode(retrieveJsonNode(jsonReader, CUSTOM_STREAM_GLOBAL), str2);
            String strNextString = jsonReaderRetrieveJsonNode != null ? jsonReaderRetrieveJsonNode.nextString() : null;
            jsonReader.close();
            return strNextString;
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public MinidumpMarkers getMinidumpMarkers() throws IOException {
        try {
            if (findStream(MD_FB_STREAM_MARKERS) == null) {
                return null;
            }
            this.mHandle.seek(r0.pos);
            return new MinidumpMarkers(readLongIntLE(), readLongIntLE());
        } catch (IOException e) {
            CFK.A0J(LOG_TAG, e, "getMinidumpMarkers failed to read");
            return null;
        }
    }

    public MinidumpReader(RandomAccessFile randomAccessFile) throws IOException {
        this.mHandle = randomAccessFile;
        randomAccessFile.seek(0L);
        if (readIntLE() != 1347241037) {
            throw BV4.A0c("Invalid minidump signature");
        }
        this.mHandle.skipBytes(4);
        this.mStreamCount = readIntLE();
        this.mStreamsPos = readIntLE();
    }

    public boolean checkIfMinidumpCorrupted() throws IOException {
        MinidumpMarkers minidumpMarkers = getMinidumpMarkers();
        return (minidumpMarkers != null ? checkMinidumpMarkerStream(minidumpMarkers.startMarker ^ minidumpMarkers.endMarker) : false) || checkMinidumpErrLogStream(getErrorLogData());
    }

    public String getCustomData(String str) {
        String string;
        String customDataFromJson = null;
        try {
            string = getString(MD_FB_APP_CUSTOM_DATA);
            if (string != null) {
                try {
                    customDataFromJson = getCustomDataFromJson(string, str);
                    return customDataFromJson;
                } catch (Exception e) {
                    e = e;
                    CFK.A0C(LOG_TAG, "getCustomData error: %s", e, string);
                    return customDataFromJson;
                }
            }
        } catch (Exception e2) {
            e = e2;
            string = "";
        }
        return customDataFromJson;
    }

    public String getErrorLogData() {
        try {
            return getString(MD_FB_DUMP_ERROR_LOG);
        } catch (IOException e) {
            CFK.A0C(LOG_TAG, "getErrorLogData error: %s", e, "");
            return null;
        }
    }

    public String getJavaStack() {
        try {
            return getString(MD_FB_JAVA_STACK);
        } catch (IOException e) {
            CFK.A0J(LOG_TAG, e, "getJavaStack error");
            return null;
        }
    }

    public Integer getInt(int i) {
        return getInt(findStream(i));
    }

    public String getString(int i) throws IOException {
        String string = getString(findStream(i));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }
}
