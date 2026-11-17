package com.facebook.aura.analytics.hatch;

import X.AnonymousClass001;
import X.AnonymousClass007;
import X.BFI;
import com.facebook.acra.util.minidump.MinidumpReader;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class HatchFileTypeKt {
    public static final Set<String> FILE_TYPE_EXTENSIONS;

    public static final Map<String, String> hatchFileTypeMetadata(String str) {
        if (str != null) {
            String strA0u = AnonymousClass001.A0u(str);
            if (FILE_TYPE_EXTENSIONS.contains(strA0u)) {
                return AnonymousClass007.A0c(HatchMetadataKey.FILE_TYPE, strA0u);
            }
        }
        return null;
    }

    static {
        String[] strArr = new String[115];
        System.arraycopy(new String[]{"7z", "aac", "ai", "aiff", "avi", "bash", "bmp", "bz2", "c", "caf", "cc", "cpp", "cs", "css", "csv", "dart", "diff", "doc", "docx", "eml", "epub", "fig", "flac", "gif", "glb", "gltf", "go"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"gz", "h", "heic", "heif", "hpp", "htm", "html", "ico", "ics", "ini", "ipynb", "java", "jpeg", "jpg", "js", "json", "jsonl", "jsx", "key", "kt", "kts", "log", "lua", "m", "m4a", "m4v", "md"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"markdown", "mjs", "mkv", "mm", "mov", "mp3", "mp4", "numbers", "odp", "ods", "odt", "ogg", "opus", "pages", "patch", "pdf", "php", "pl", "png", "ppt", "pptx", "psd", "py", "r", "rar", "rb", "rs"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"rtf", "scala", "sh", "sql", "srt", "stl", "svg", "swift", "tar", "tex", "text", "tgz", "tif", "tiff", "toml", "ts", "tsv", "tsx", "txt", "usdz", "vcf", "vtt", "wasm", "wav", "webm", "webp", "xls"}, 0, strArr, 81, 27);
        System.arraycopy(new String[]{"xlsx", "xml", "xz", "yaml", "yml", "zip", "zsh"}, 0, strArr, MinidumpReader.MODULE_FULL_SIZE, 7);
        FILE_TYPE_EXTENSIONS = BFI.A0H(strArr);
    }
}
