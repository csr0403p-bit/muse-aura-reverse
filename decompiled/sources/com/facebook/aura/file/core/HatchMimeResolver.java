package com.facebook.aura.file.core;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFI;
import X.BGK;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.file.view.PptxViewerKt;
import com.facebook.aura.sharesheet.HatchShareSheetViewModelKt;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HatchMimeResolver {
    public static final HatchMimeResolver INSTANCE = new HatchMimeResolver();
    public static final String MIME_TYPE_HTML = "text/html";
    public static final String MIME_TYPE_SVG = "image/svg+xml";
    public static final String OCTET_STREAM = "application/octet-stream";
    public static final String[] SUPPORTED_ATTACHMENT_MIME_TYPES;

    public final class Extensions {
        public static final Set<String> AUDIO;
        public static final Set<String> CODE;
        public static final Set<String> DOCUMENT;
        public static final Set<String> EDITABLE;
        public static final Set<String> HTML;
        public static final Set<String> IMAGE;
        public static final Extensions INSTANCE = new Extensions();
        public static final Set<String> IS_MEDIA_FILE;
        public static final Set<String> IS_TEXT_FILE;
        public static final Set<String> MARKDOWN;
        public static final Set<String> PDF;
        public static final Set<String> PRESENTATION;
        public static final Set<String> SPREADSHEET;
        public static final Set<String> TEXT;
        public static final Set<String> VIDEO;

        static {
            Set<String> setA0H = BFI.A0H(new String[]{"md", "markdown", "mdown", "txt", "text"});
            TEXT = setA0H;
            String[] strArr = new String[28];
            System.arraycopy(new String[]{"json", "jsonl", "yaml", "yml", "toml", "xml", "plist", "swift", "ts", "js", "jsx", "tsx", "py", "rs", "go", "rb", "java", "c", "cpp", "h", "hpp", "sh", "zsh", "bash", "sql", "css", "scss"}, 0, strArr, 0, 27);
            System.arraycopy(new String[]{"kt"}, 0, strArr, 27, 1);
            Set<String> setA0H2 = BFI.A0H(strArr);
            CODE = setA0H2;
            Set<String> setA0H3 = BFI.A0H(new String[]{"png", "jpg", "jpeg", "gif", "webp", "heic", "heif", "svg", "bmp", "ico"});
            IMAGE = setA0H3;
            Set<String> setA19 = C60O.A19("html", "htm");
            HTML = setA19;
            PDF = Collections.singleton("pdf");
            DOCUMENT = Collections.singleton("docx");
            SPREADSHEET = C60O.A19("xlsx", "csv");
            PRESENTATION = Collections.singleton("pptx");
            Set<String> setA0H4 = BFI.A0H(new String[]{"mp3", "m4a", "wav", "ogg", "aac"});
            AUDIO = setA0H4;
            Set<String> setA1B = C60O.A1B("mp4", "mov", "avi", "mkv");
            VIDEO = setA1B;
            MARKDOWN = C60O.A1A("md", "markdown", "mdown");
            EDITABLE = BGK.A01(setA19, BGK.A01(setA0H2, setA0H));
            IS_TEXT_FILE = BGK.A01(setA19, BGK.A01(setA0H2, setA0H));
            IS_MEDIA_FILE = BGK.A01(setA1B, BGK.A01(setA0H4, setA0H3));
        }

        public final Set<String> getAUDIO() {
            return AUDIO;
        }

        public final Set<String> getCODE() {
            return CODE;
        }

        public final Set<String> getDOCUMENT() {
            return DOCUMENT;
        }

        public final Set<String> getEDITABLE() {
            return EDITABLE;
        }

        public final Set<String> getHTML() {
            return HTML;
        }

        public final Set<String> getIMAGE() {
            return IMAGE;
        }

        public final Set<String> getIS_MEDIA_FILE() {
            return IS_MEDIA_FILE;
        }

        public final Set<String> getIS_TEXT_FILE() {
            return IS_TEXT_FILE;
        }

        public final Set<String> getMARKDOWN() {
            return MARKDOWN;
        }

        public final Set<String> getPDF() {
            return PDF;
        }

        public final Set<String> getPRESENTATION() {
            return PRESENTATION;
        }

        public final Set<String> getSPREADSHEET() {
            return SPREADSHEET;
        }

        public final Set<String> getTEXT() {
            return TEXT;
        }

        public final Set<String> getVIDEO() {
            return VIDEO;
        }
    }

    public final boolean isSvg(String str, String... strArr) {
        String strA0S;
        String strA0S2;
        C7384Etj.A0Y(strArr, 1);
        if (str == null || !str.equalsIgnoreCase(MIME_TYPE_SVG)) {
            for (String str2 : strArr) {
                if (str2 != null && (strA0S = C7BY.A0S(str2, str2, '?')) != null && (strA0S2 = C7BY.A0S(strA0S, strA0S, '#')) != null) {
                    int length = strA0S2.length();
                    int length2 = ".svg".length();
                    if (strA0S2.regionMatches(true, length - length2, ".svg", 0, length2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String labelForMime(String str) {
        String str2;
        C7384Etj.A0Y(str, 0);
        String strA0u = AnonymousClass001.A0u(C7BY.A0Q(str, "", '/'));
        switch (strA0u.hashCode()) {
            case -2005364812:
                return strA0u.equals("vnd.openxmlformats-officedocument.presentationml.presentation") ? "PPTX" : "File";
            case -1064529488:
                return strA0u.equals("msword") ? "DOC" : "File";
            case -417226990:
                return strA0u.equals("vnd.openxmlformats-officedocument.wordprocessingml.document") ? "DOCX" : "File";
            case -402568494:
                return strA0u.equals("vnd.ms-excel") ? "XLS" : "File";
            case 98822:
                return strA0u.equals("csv") ? "CSV" : "File";
            case 102340:
                return strA0u.equals("gif") ? "GIF" : "File";
            case 103649:
                str2 = "htm";
                break;
            case 108273:
                return strA0u.equals("mp4") ? "MP4" : "File";
            case 110834:
                return strA0u.equals("pdf") ? "PDF" : "File";
            case 111145:
                return strA0u.equals("png") ? "PNG" : "File";
            case 117484:
                return strA0u.equals("wav") ? "WAV" : "File";
            case 118807:
                return strA0u.equals("xml") ? "XML" : "File";
            case 120609:
                return strA0u.equals("zip") ? "ZIP" : "File";
            case 3213227:
                str2 = "html";
                break;
            case 3268712:
                return strA0u.equals("jpeg") ? "JPEG" : "File";
            case 3271912:
                return strA0u.equals("json") ? "JSON" : "File";
            case 3358085:
                return strA0u.equals("mpeg") ? str.startsWith("audio") ? "MP3" : "MPEG" : "File";
            case 3645340:
                return strA0u.equals("webp") ? "WEBP" : "File";
            case 106748362:
                return strA0u.equals("plain") ? "TXT" : "File";
            case 246938863:
                return strA0u.equals("markdown") ? "MD" : "File";
            case 344557680:
                return strA0u.equals("vnd.ms-powerpoint") ? "PPT" : "File";
            case 572684321:
                return strA0u.equals("vnd.openxmlformats-officedocument.spreadsheetml.sheet") ? "XLSX" : "File";
            default:
                return "File";
        }
        return strA0u.equals(str2) ? "HTML" : "File";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0203 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x025b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mimeForName(java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.core.HatchMimeResolver.mimeForName(java.lang.String):java.lang.String");
    }

    public final String mimeFromBytes(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        int length = bArr.length;
        if (length < 4) {
            return null;
        }
        byte b = bArr[0];
        if (b == -119) {
            if (bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) {
                return HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE;
            }
        } else if (b == -1 && bArr[1] == -40 && bArr[2] == -1) {
            return MediaDeviceSyncClientKt.FALLBACK_MIME;
        }
        if (b == 71 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 56) {
            return "image/gif";
        }
        if (length < 12 || b != 82) {
            if (b == 66 && bArr[1] == 77) {
                return "image/bmp";
            }
            return null;
        }
        if (bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80) {
            return "image/webp";
        }
        return null;
    }

    static {
        String[] strArr = new String[34];
        System.arraycopy(new String[]{"text/plain", "application/json", "application/xml", "text/xml", "text/html", "text/css", "application/javascript", "text/javascript", "text/csv", "text/markdown", "text/x-markdown", "application/pdf", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.ms-powerpoint", PptxViewerKt.PPTX_MIME_TYPE, "text/x-python", "text/x-kotlin", "text/x-java", "text/x-c", "text/x-c++src", "text/x-swift", "text/x-rust", "text/x-go", "text/x-ruby"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"text/x-php", "application/x-sh", "application/x-yaml", "text/yaml", "text/x-yaml", "application/yaml", "application/octet-stream"}, 0, strArr, 27, 7);
        SUPPORTED_ATTACHMENT_MIME_TYPES = strArr;
    }

    public final String[] getSUPPORTED_ATTACHMENT_MIME_TYPES() {
        return SUPPORTED_ATTACHMENT_MIME_TYPES;
    }

    public final String extensionForMime(String str) {
        switch (C60R.A03(str)) {
            case -1487394660:
                if (str.equals(MediaDeviceSyncClientKt.FALLBACK_MIME)) {
                    return "jpg";
                }
                return null;
            case -1487018032:
                if (str.equals("image/webp")) {
                    return "webp";
                }
                return null;
            case -879272239:
                if (str.equals("image/bmp")) {
                    return "bmp";
                }
                return null;
            case -879267568:
                if (str.equals("image/gif")) {
                    return "gif";
                }
                return null;
            case -879258763:
                if (str.equals(HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE)) {
                    return "png";
                }
                return null;
            default:
                return null;
        }
    }

    public final String mimeForContentUri(Context context, Uri uri) {
        AnonymousClass003.A0u(context, uri);
        String type = context.getContentResolver().getType(uri);
        if (type != null) {
            return type;
        }
        String lastPathSegment = uri.getLastPathSegment();
        return lastPathSegment == null ? "application/octet-stream" : mimeForName(lastPathSegment);
    }
}
