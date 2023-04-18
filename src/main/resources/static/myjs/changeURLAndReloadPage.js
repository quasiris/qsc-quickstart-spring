
function changeURLAndReloadPage() {

    const startURL = 'http://localhost:8080';
    const path = '/search';
    const param= '?q=wago';
    // ?q=${encodeURIComponent(document.getElementById('query').textContent)}`;
    const filter = '?f.availability=available';

  const checkbox = document.getElementById('availability-checkbox');

  if (checkbox.checked) {
    console.log("Checkbox ist ausgewaehlt");
    const resultURL = startURL + path + param + filter;
    window.location.href = resultURL;
  }
}

changeURLAndReloadPage();


