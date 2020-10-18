Scalaひどいコード選手権用コード

## コンセプト
Implicit conversion地獄による、なんとなく書いてる分には便利そうだけど一度問題が起きると全く処理がおえないクソコード

## 実装の方針

式のcase classはデータ構造のみを保持。インタープリターの代わりに、implicit conversionを利用してfunctionを持つクラスに変換し処理を実装

## 効果

一見すると普通のコードだが、実装場所があっちこっちにとっちらかり、そのおかげでどこをどう拡張すべきかが全くわからなくなる。
