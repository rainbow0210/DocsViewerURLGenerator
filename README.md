# DocsViewerURLGenerator

# Japanese
## 概要
このプログラムは、通常のファイルURLをGoogle Docs Viewerで埋め込み表示可能なURLに変換します。主にPDFなどのドキュメントをブラウザ内に埋め込んで表示する用途を想定しています。

## 使用技術
- 言語: Java
- ライブラリ/フレームワーク: 標準Javaライブラリ
- データベース: なし
- その他: なし

## 使い方
### 前提条件
- JDK 8 以上がインストールされていること
- 対象ファイルはインターネットから直接アクセス可能であること（公開URL）

### インストール方法
```bash
git clone https://github.com/username/DocsViewerURLGenerator.git
cd DocsViewerURLGenerator
```

### 基本的な使い方
1. ソースのコンパイル:
```bash
javac DocsViewerURLGenerator.java
```
2. 実行:
```bash
java DocsViewerURLGenerator
```

### 推奨する貼り付け（入力）URL形式
- 直接ダウンロード可能なファイルURL（推奨）:
	- https://example.com/path/to/file.pdf
	- https://example.com/files/document.docx
- Google Drive 等の共有リンクを使用する場合:
	- 共有リンクそのままではビューアに渡せないことが多いです。Driveファイルを使う場合は「ダウンロード用の直リンク」（例: https://drive.google.com/uc?export=download&id=FILEID）に変換してください。
- NG例:
	- Google Drive のプレビュー用URL（/open?id=... や /file/d/.../view のまま）は動作しないことがあります。

注意点:
- 入力URLに日本語や空白等が含まれる場合はURLエンコードが必要です（`URLEncoder` を用いてエンコードしてください）。
- 対象ファイルはCORSや認証でブロックされていない公開URLである必要があります。

## 主な機能
- 入力された通常URLをエンコードしてGoogle Docs Viewer用URLに変換する。
- 一般的なファイル形式（PDF, DOCX 等）に対応する。

## 設定
- 特別な環境変数は不要です。ネットワークからアクセス可能なURLを入力してください。
- 必要であれば設定ファイルや引数でエンコード方式や出力形式を切り替える実装を追加できます。

## APIリファレンス
- 実装ファイル: DocsViewerURLGenerator.java
- 生成されるURLの例:
	- https://docs.google.com/viewer?url=<エンコード済みURL>
	- https://docs.google.com/gview?embedded=true&url=<エンコード済みURL>

## 参考サイト
- PDFをページ内に埋め込んで表示するGoogle Docs Viewer(スマホ, PC): https://webbibouroku.com/Blog/Article/google-docs-viewer
- JavaDrive | switch文を使った条件分岐: https://www.javadrive.jp/start/if/index4.html
- ぺんたん | 文字列の部分一致検索を行う方法: https://pentan.info/java/sample/str_search.html
- POTEPAN STYLE | 【Java】URLをエンコード・デコードする方法についてサンプル付きで解説！: https://style.potepan.com/articles/28793.html
- Oracle | URLEncoder (Java Platform SE 8 ): https://docs.oracle.com/javase/jp/8/docs/api/java/net/URLEncoder.html
- Qiita | Javaの例外処理について: https://qiita.com/pitan109/items/c9910edddc007126df41

# English
## Overview
This program converts a normal file URL into a Google Docs Viewer URL. It is intended to enable embedding documents (such as PDFs) in a browser using Google Docs Viewer.

## Technologies
- Language: Java
- Libraries/Frameworks: Standard Java library
- Database: None
- Other: None

## Usage
### Requirements
- JDK 8 or higher
- The target file must be accessible from the internet (public URL)

### Installation
```bash
git clone https://github.com/username/DocsViewerURLGenerator.git
cd DocsViewerURLGenerator
```

### Basic usage
1. Compile the source:
```bash
javac DocsViewerURLGenerator.java
```
2. Run:
```bash
java DocsViewerURLGenerator
```

### Recommended input URL formats
- Direct downloadable file URLs (recommended):
  - https://example.com/path/to/file.pdf
  - https://example.com/files/document.docx
- If using Google Drive share links:
  - Shared link may not work directly. Convert to a direct download link like:
    `https://drive.google.com/uc?export=download&id=FILEID`.
- Not recommended:
  - Drive preview URLs such as `/open?id=...` or `/file/d/.../view` often do not work.

Notes:
- If the input URL contains non-ASCII characters or spaces, URL-encode it (use `URLEncoder`).
- The target file must be publicly accessible and not blocked by CORS or authentication.

## Main features
- Encode an input URL and produce a Google Docs Viewer-compatible URL.
- Supports common document formats (PDF, DOCX, etc.).

## Configuration
- No special environment variables are required. Provide a network-accessible URL as input.
- You may extend the program to accept configuration files or flags to change encoding or output behavior.

## API reference
- Implementation file: DocsViewerURLGenerator.java
- Example generated URLs:
  - https://docs.google.com/viewer?url=<URL-ENCODED-URL>
  - https://docs.google.com/gview?embedded=true&url=<URL-ENCODED-URL>

## References
- PDFをページ内に埋め込んで表示するGoogle Docs Viewer(スマホ, PC): https://webbibouroku.com/Blog/Article/google-docs-viewer
- JavaDrive | switch文を使った条件分岐: https://www.javadrive.jp/start/if/index4.html
- ぺんたん | 文字列の部分一致検索を行う方法: https://pentan.info/java/sample/str_search.html
- POTEPAN STYLE | 【Java】URLをエンコード・デコードする方法についてサンプル付きで解説！: https://style.potepan.com/articles/28793.html
- Oracle | URLEncoder (Java Platform SE 8 ): https://docs.oracle.com/javase/jp/8/docs/api/java/net/URLEncoder.html
- Qiita | Javaの例外処理について: https://qiita.com/pitan109/items/c9910edddc007126df41
