作成した時期：令和6年6月<br>
所要時間：約　不明　時間<br>
協力者の有無：無し<br><br>

# forecast-demand
 通所している事業所で、利用者に提供している昼食のお弁当について<br>
 需要の変動が大きく、また在庫の保管場所が限られているために<br>
 在庫管理に苦慮しているということを聞き<br>
 Spring Bootの勉強を兼ねて需要予測の補助ができるツールを制作しました。<br>
 <br>
 過去の使用数等のデータがないため本格的な需要予測はできませんが<br>
 発注数と使用数、今後の使用数の見込みを入力すると今後の在庫推移の予想グラフが描画されます。
 
# 工夫した点
 今後の在庫数の変動をグラフ化することで一目でわかるようにした。<br>
 分かりやすいグラフ表示を実現するためにChart.jsを利用した。
 
# 機能一覧
 使用数予測登録・修正・削除機能（グラフ表示もこの機能で行う）<br>
 使用数実績登録・修正・削除機能<br>
 発注情報登録・修正・削除機能
 
# 余裕があれば作る機能
 需要数予測機能（前年実績、当年の直近の実績、天気、気温等から計算する）<br>
 マスタ管理機能（営業日カレンダー、天気、最大在庫、最小在庫）
 
# さらに余裕があれば作る機能
 気象庁のCSVデータから天気情報取り込み
 
# 実装環境
バックエンド：Java(SpringBoot),MySQL<br>
フロントエンド：HTML,CSS(BootStrap),Thymeleaf,Chart.js
