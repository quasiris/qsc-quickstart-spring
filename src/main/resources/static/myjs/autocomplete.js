$(function() {
  var availableTags = [
   "ejot"
  ];
  $("#query").autocomplete({
    source: availableTags
  });
});